package chinaren.common;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SessionContext
 * @Description Session的上下文数据结构
 * @author 李浩然
 * @date 2017年7月20日
 * @version 1.0
 */
public class SessionContext {
    public static final String ATTR_USER_ID = "userId";

    private static SessionContext instance;
    private Map<String, HttpSession> sessionMap;

    private SessionContext() {
        sessionMap = new HashMap<>();
    }

    public static SessionContext getInstance() {
        if(instance == null) {
            instance = new SessionContext();
        }
        return instance;
    }

    public synchronized void addSession(HttpSession session) {
        if (session != null) {
            sessionMap.put(session.getId(), session);
        }
    }

    public synchronized void delSession(HttpSession session) {
        if(session != null) {
            sessionMap.remove(session.getId());
            if(session.getAttribute(ATTR_USER_ID) != null) {
                sessionMap.remove(session.getAttribute(ATTR_USER_ID).toString());
                // session.invalidate();
            }
        }
    }

    public synchronized HttpSession getSession(String sessionId) {
        if(sessionId == null)
            return null;
        return sessionMap.get(sessionId);
    }

    public Map getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, HttpSession> sessionMap) {
        this.sessionMap = sessionMap;
    }
}
