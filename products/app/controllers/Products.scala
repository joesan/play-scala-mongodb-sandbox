package controllers

import play.api.mvc.{Action, Controller}
import models.Product

/**
 * Created with IntelliJ IDEA.
 * User: jothi
 * Date: 12/2/13
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
object Products extends Controller {

  def list = Action { implicit request =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }

  def show(ean: Long) = Action { implicit request =>
    Product.findByEan(ean).map { product =>
      Ok(views.html.products.details(product))
    }.getOrElse(NotFound)
  }
}
