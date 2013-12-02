package models

/**
 * Created with IntelliJ IDEA.
 * User: jothi
 * Date: 12/2/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */

case class Product(ean: Long, name: String, description: String)

object Product {
  val products = Set(
    Product(5010255079763L, "Paper Clips", "A pack of Paper Clips"),
    Product(5018206244666L, "Giant Paper Clips", "A pack of Giant Paper Clips"),
    Product(5010255079765L, "No Tear Paper Clips", "A pack of No Tear Paper Clips"),
    Product(5010255079766L, "Extra Large Paper Clips", "A pack of Extra Large Paper Clips"),
    Product(5010255079767L, "Zebra Paper Clips", "A pack of assorted Paper Clips")
  )

  def findAll = products.toList.sortBy(_.ean)

  def findByEan(ean: Long) = products.find(_.ean == ean)
}
