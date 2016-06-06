package group3.henry.login.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticationInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("login interceptor!");
		
		ActionContext ctx = invocation.getInvocationContext();
		Map<String, Object> session = ctx.getSession();
		String account = (String) session.get("account"); //obtains login flag
				
		if (account == null) { //if not logged in, send to login page 
			HttpServletRequest request = ServletActionContext.getRequest();
			String location = request.getRequestURI();
			session.put("location", location);
			ctx.put("message", "You are not logged in!"); 
			System.out.println(location);
			return "login";
		} else {
			return invocation.invoke(); // passes control to the next intercepter
		}
	}
}
