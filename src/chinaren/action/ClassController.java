package chinaren.action;

import chinaren.common.SessionContext;
import chinaren.model.Class;
import chinaren.model.Result;
import chinaren.service.ClassService;
import chinaren.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 班级相关请求控制器
 * @ClassName ClassController 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
@Controller
public class ClassController {

    @Autowired
    private ClassService classService;

    @Autowired
    private UserService userService;

    private Logger logger = Logger.getLogger(ClassController.class);

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss - ");

    /**
     * 处理创建班级界面获取请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/createClass", method = RequestMethod.GET)
    public ModelAndView createClassPage(HttpSession session,
                                    @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        Class clazz = new Class();
        clazz.setManagerId(Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString()));
        clazz.setManagerName(displayName);
        ModelAndView modelAndView = new ModelAndView("create_class");
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("provinces", userService.getAddressContext().getProvinces())
                .addObject("cities", userService.getAddressContext().getCities())
                .addObject("areas", userService.getAddressContext().getAreas())
                .addObject("clazz", clazz);
        return modelAndView;
    }

    /**
     * 处理创建班级请求
     * @author 李浩然
     * @param session Session实体
     * @param clazz 班级实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/createClass", method = RequestMethod.POST)
    public ModelAndView createClass(HttpSession session, @ModelAttribute("clazz") Class clazz,
                                    @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView();
        clazz.setManagerId(Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString()));
        clazz.setManagerName(displayName);
        Result<Boolean> result = classService.createClass(clazz);
        if (!result.isSuccessful()) {
            modelAndView.setViewName("create_class");
            modelAndView.addObject("has_error", true)
                    .addObject("error_message", result.getMessage())
                    .addObject("display_name", displayName)
                    .addObject("provinces", userService.getAddressContext().getProvinces())
                    .addObject("cities", userService.getAddressContext().getCities())
                    .addObject("areas", userService.getAddressContext().getAreas())
                    .addObject("clazz", clazz);
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/manageClass");
        return modelAndView;
    }

    /**
     * 处理我的班级用户请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/myClass", method = RequestMethod.GET)
    public ModelAndView getMyClasses(HttpSession session,
                                       @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("my_class");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        Result<List<Class>> myClassResult = classService.getClasses(userId, true);
        Result<List<Class>> applyClassResult = classService.getClasses(userId, false);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("myClasses", myClassResult.getResult())
                .addObject("applyClasses", applyClassResult.getResult());
        return modelAndView;
    }

    /**
     * 处理退出班级请求
     * @author 李浩然
     * @param classId 班级ID
     * @param session Session实体
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/exitClass", method = RequestMethod.POST)
    public ModelAndView exitClass(@RequestParam("class_id") long classId, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("redirect:/myClass");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        classService.exitClass(userId, classId);
        return  modelAndView;
    }

    /**
     * 处理班级管理界面获取请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/manageClass", method = RequestMethod.GET)
    public ModelAndView getManageClassPage(HttpSession session,
                                       @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("manage_class");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        Result<List<Class>> manageClassesResult = classService.getManageClasses(userId);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("manageClasses", manageClassesResult.getResult());
        return modelAndView;
    }

    /**
     * 处理班级管理操作请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @param classId 班级ID
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/manageClass", method = RequestMethod.POST)
    public ModelAndView getManageClassmateList(HttpSession session,
                                               @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName,
                                               @RequestParam("class_id") long classId) {
        ModelAndView modelAndView = new ModelAndView("manage_classmates");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("clazz", classService.getClassInformation(classId).getResult())
                .addObject("classmates", classService.getUsersByClassId(classId, true).getResult())
                .addObject("applyUsers", classService.getUsersByClassId(classId, false).getResult());
        return modelAndView;
    }

    /**
     * 处理删除班级请求
     * @author 李浩然
     * @param session Session实体
     * @param classId 班级ID
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/removeClass", method = RequestMethod.POST)
    public ModelAndView removeClass(HttpSession session,
                                    @RequestParam("class_id") long classId) {
        ModelAndView modelAndView = new ModelAndView("redirect:/manageClass");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        logger.info(dateFormat.format(new Date()) + classService.removeClass(userId, classId).getMessage());
        return  modelAndView;
    }

    /**
     * 处理移除班级成员请求
     * @author 李浩然
     * @param classId 班级ID
     * @param userId 待移除的班级成员的用户ID
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/removeClassmate", method = RequestMethod.POST)
    public ModelAndView removeClassmate(@RequestParam("class_id") long classId,
                                      @RequestParam("user_id") long userId, HttpSession session,
                                      @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("manage_classmates");
        long managerId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        classService.removeClassmate(managerId, userId, classId);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", managerId)
                .addObject("clazz", classService.getClassInformation(classId).getResult())
                .addObject("classmates", classService.getUsersByClassId(classId, true).getResult())
                .addObject("applyUsers", classService.getUsersByClassId(classId, false).getResult());
        return  modelAndView;
    }

    /**
     * 处理拒绝加入班级请求
     * @author 李浩然
     * @param classId 班级ID
     * @param userId 被拒绝加入班级的用户的ID
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/refuseJoin", method = RequestMethod.POST)
    public ModelAndView refuseJoining(@RequestParam("class_id") long classId,
                                      @RequestParam("user_id") long userId, HttpSession session,
                                      @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("manage_classmates");
        long managerId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        classService.refuseJoinClass(managerId, userId, classId);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", managerId)
                .addObject("clazz", classService.getClassInformation(classId).getResult())
                .addObject("classmates", classService.getUsersByClassId(classId, true).getResult())
                .addObject("applyUsers", classService.getUsersByClassId(classId, false).getResult());
        return  modelAndView;
    }

    /**
     * 处理允许加入班级请求
     * @author 李浩然
     * @param classId 班级ID
     * @param userId 允许加入班级的用户的ID
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/allowJoin", method = RequestMethod.POST)
    public ModelAndView allowJoining(@RequestParam("class_id") long classId,
                                      @RequestParam("user_id") long userId, HttpSession session,
                                      @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("manage_classmates");
        long managerId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        classService.allowJoinClass(managerId, userId, classId);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", managerId)
                .addObject("clazz", classService.getClassInformation(classId).getResult())
                .addObject("classmates", classService.getUsersByClassId(classId, true).getResult())
                .addObject("applyUsers", classService.getUsersByClassId(classId, false).getResult());
        return  modelAndView;
    }

    /**
     * 处理修改班级描述请求
     * @author 李浩然
     * @param classId 班级ID
     * @param session Session实体
     * @param description 新的班级描述
     * @param response HTTP响应实体
     * @throws IOException IO处理异常
     */
    @RequestMapping(value = "/modifyDescription", method = RequestMethod.POST)
    @ResponseBody
    public void modifyDescription(@RequestParam("class_id") long classId, HttpSession session,
                                  @RequestParam("description") String description,
                                  HttpServletResponse response) throws IOException {
        long managerId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        PrintWriter out = response.getWriter();
        if (classService.modifyDescription(managerId, classId, description).isSuccessful()) {
            out.append("successful");
            out.flush();
        } else {
            out.append("failed");
            out.flush();
        }
    }

    /**
     * 处理获取搜索班级界面请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/searchClass", method = RequestMethod.GET)
    public ModelAndView getSearchClassPage(HttpSession session, @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("search_class");
        List<Class> classes = new ArrayList<>();
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("provinces", userService.getAddressContext().getProvinces())
                .addObject("cities", userService.getAddressContext().getCities())
                .addObject("areas", userService.getAddressContext().getAreas())
                .addObject("classes", classes);
        return modelAndView;
    }

    /**
     * 处理搜索班级请求
     * @author 李浩然
     * @param action 请求的操作类型
     * @param request HTTP请求实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/searchClass", method = RequestMethod.POST)
    public ModelAndView searchClass(@RequestParam("action") int action, HttpServletRequest request,
                                    @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("search_class");
        List<Class> classes = new ArrayList<>();
        long userId = Long.parseLong(request.getSession().getAttribute(SessionContext.ATTR_USER_ID).toString());
        if (action == 1) {
            String province = request.getParameter("province");
            String city = request.getParameter("city");
            String area = request.getParameter("area");
            String school = request.getParameter("school");
            String gradeYear = request.getParameter("gradeYear");
            String className = request.getParameter("className");
            classes = classService.searchClasses(province, city, area, school, gradeYear, className).getResult();
        } else if (action == 2) {
            long classId = Long.parseLong(request.getParameter("class_id"));
            classService.applyJoinClass(userId, classId);
            modelAndView.setViewName("redirect:/myClass");
            return modelAndView;
        }
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("provinces", userService.getAddressContext().getProvinces())
                .addObject("cities", userService.getAddressContext().getCities())
                .addObject("areas", userService.getAddressContext().getAreas())
                .addObject("classes", classes);
        return modelAndView;
    }
}
