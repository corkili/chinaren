package chinaren.action;

import chinaren.common.SessionContext;
import chinaren.model.Class;
import chinaren.model.Message;
import chinaren.model.Result;
import chinaren.service.ClassService;
import chinaren.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 留言相关请求控制器
 * @ClassName MessageController 
 * @author 李浩然
 * @date 2017年7月27日
 * @version 1.0
 */
@Controller
public class MessageController {

    @Autowired
    private ClassService classService;


    @Autowired
    private MessageService messageService;

    /**
     * 处理班级留言界面获取请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称 
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/classMessage", method = RequestMethod.GET)
    public ModelAndView classMessagePage(HttpSession session,
                                       @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("class_message");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        Result<List<Class>> myClassResult = classService.getClasses(userId, true);
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("myClasses", myClassResult.getResult());
        return modelAndView;
    }

    /**
     * 处理班级留言操作请求
     * @author 李浩然
     * @param session Session实体
     * @param request HTTP请求实体
     * @param action 请求的操作类型
     * @param classId 班级ID
     * @param managerId 班级管理者ID
     * @param className 班级名称
     * @param displayName 用户名
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/classMessage", method = RequestMethod.POST)
    public ModelAndView getClassMessages(HttpSession session, HttpServletRequest request,
                                       @RequestParam("action") int action,
                                       @RequestParam("class_id") long classId,
                                       @RequestParam("manager_id") long managerId,
                                       @RequestParam("class_name") String className,
                                       @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("class_message_view");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        if (action == 1) {
            long messageId = Long.parseLong(request.getParameter("message_id"));
            messageService.deleteMessage(messageId);
        } else if (action == 2) {
            String content = request.getParameter("content");
            Message message = new Message();
            message.setMsgTime(new Date());
            message.setClassId(classId);
            message.setUserId(userId);
            message.setClassName(className);
            message.setName(displayName);
            message.setContent(content);
            messageService.releaseMessage(message);
        }
        Result<List<Message>> messagesResult = messageService.getClassMessages(classId);
        List<Message> messages = messagesResult.getResult();
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("class_id", classId)
                .addObject("class_name", className)
                .addObject("manager_id", managerId)
                .addObject("messages", messages);
        return modelAndView;
    }

    /**
     * 处理用户留言获取请求
     * @author 李浩然
     * @param session Session实体
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/myMessage", method = RequestMethod.GET)
    public ModelAndView getMyMessages(HttpSession session,
                                       @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("my_messages");
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        Result<List<Message>> messagesResult = messageService.getUserMessages(userId);
        List<Message> messages = messagesResult.getResult();
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("messages", messages);
        return modelAndView;
    }

    /**
     * 处理用户留言操作请求
     * @author 李浩然
     * @param session Session
     * @param action 请求的操作类型
     * @param messageId 班级管理者ID
     * @param displayName 用户名称
     * @return 跳转视图及相关模型
     */
    @RequestMapping(value = "/myMessage", method = RequestMethod.POST)
    public ModelAndView progressMyMessage(HttpSession session,
                                         @RequestParam("action") int action,
                                         @RequestParam("messageId") long messageId,
                                         @SessionAttribute(SessionContext.ATTR_USER_NAME) String displayName) {
        ModelAndView modelAndView = new ModelAndView("my_messages");
        if (action == 1) {
            messageService.deleteMessage(messageId);
        }
        long userId = Long.parseLong(session.getAttribute(SessionContext.ATTR_USER_ID).toString());
        Result<List<Message>> messagesResult = messageService.getUserMessages(userId);
        List<Message> messages = messagesResult.getResult();
        modelAndView.addObject("has_error", false)
                .addObject("error_message", "")
                .addObject("display_name", displayName)
                .addObject("user_id", userId)
                .addObject("messages", messages);
        return modelAndView;
    }
}
