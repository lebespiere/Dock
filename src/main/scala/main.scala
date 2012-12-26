package sandbox

import ru.circumflex._, core._, web._, freemarker._

class Main extends Router {

  rewrite("/") = "/index"
  get("/*") = ftl(uri(1) + ".ftl")
}