package chinaren.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName SessionInterceptor
 * @Description 自定义Session拦截器
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
@Component("SpringMVCInterceptor")
public class SessionInterceptor implements HandlerInterceptor {

    Logger logger = Logger.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        // 过滤登录、退出访问
        String[] noFilters = new String[] { "login", "register", "captcha" };

        String uri = request.getRequestURI();

        String userId = (String)session.getAttribute(SessionContext.ATTR_USER_ID);

        for (String s : noFilters) {
            if(uri.contains(s)){
                logger.info("true");
                return true;
            }
        }

        if(userId == null) {
            logger.info("false");
            response.sendRedirect("/no_login");
            return false;
        }

        logger.info("true");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
