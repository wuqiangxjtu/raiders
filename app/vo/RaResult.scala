package vo

import play.api.libs.json._

object RaResultConstants {
  val SUCCESS = 0
  val SYSTEM_ERROR = 1
  val BUSINESS_ERROR = 2
  val NO_AUTH = 126
  val NO_LOGIN = 127
}

object RaResults {
  case class RaResult(status: Int, message: String, data: JsValue);
  implicit val raResultWriter = new Writes[RaResult] {
    def writes(raResult: RaResult) = Json.obj(
      "status" -> raResult.status,
      "message" -> raResult.message,
      "data" -> raResult.data)
  }
  def raSuccess(data: JsValue = Json.obj()) = {
    val raResult = RaResult(RaResultConstants.SUCCESS, "", data)
    Json.toJson(raResult)
  }

  def raFail(message: String = "") = {
    val raResult = RaResult(RaResultConstants.SYSTEM_ERROR, message, Json.obj())
    Json.toJson(raResult)
  }

  def raBusiFail(message: String = "") = {
  	val raResult = RaResult(RaResultConstants.BUSINESS_ERROR, message, Json.obj())
  	Json.toJson(raResult)
  }

  def raNoAuth() = {
    val raResult = RaResult(RaResultConstants.NO_AUTH, "", Json.obj())
    Json.toJson(raResult)
  }

  def raNoLogin() = {
    val raResult = RaResult(RaResultConstants.NO_LOGIN, "", Json.obj())
    Json.toJson(raResult)
  }
}

