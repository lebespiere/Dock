package sandbox

import ru.circumflex._, core._, web._, freemarker._
import java.util.Date

class Main extends Router {
  val log = new Logger("sandbox")

  'currentDate := new Date

  get("/") = ftl("index.ftl")
  get("/*") = ftl(uri(1) + ".ftl")

}