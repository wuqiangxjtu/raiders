package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._ // JSON library
import vo.RaResults._

class Application extends Controller {

  def index = Action {
    Ok(raFail("fail reason"))
  }

}
