package olive.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class, property = { "sling.servlet.paths=" + "/bin/olive/NameServlet",
		"sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.extensions=" + "txt" })
public class NameServlet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		logger.info("In Name Servlet");
		String fn = request.getParameter("firstname");
		logger.info("First name=" + fn);
		String check = changecase(fn);
		logger.info("check=" + check);
		response.setHeader("Content-Type", "text/html");
		
		response.getWriter().write(check+" is converted to Uppercase");
		response.getWriter().close();

		logger.info("end of Name servlet");
	}

	private String changecase(String fn) {
		// TODO Auto-generated method stub
		fn = fn.toUpperCase();
		return fn;
	}
	
}

//http://localhost:4508/bin/olive/NameServlet.txt?firstname=maithri look in line26 for parameter name
