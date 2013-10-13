package controllers

import play.api.mvc.{Controller, Action}

/**
 * Created with IntelliJ IDEA.
 * User: cscarioni
 * Date: 13/10/2013
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
object League extends Controller{

  def list(id: Int) = Action {
    NotImplemented
  }

  def details(id: Long) = Action {
    NotImplemented
  }

  def edit(id: Long) = Action {
    NotImplemented
  }

  def update(id: Long) = Action {
    NotImplemented
  }

  def create = Action { request =>
    val leagueJson = request.body.asJson
    Ok
  }
}
