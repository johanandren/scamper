package scamper

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class BasicServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, res: HttpServletResponse) =
    req.getRequestURI() match {
      case "/fast" => Responder.fast(res)
      case "/medium" => Responder.medium(res)
      case "/slow" => Responder.slow(res)
    }
}

