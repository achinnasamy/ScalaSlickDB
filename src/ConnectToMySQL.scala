//import slick.backend.DatabaseConfig
//import slick.lifted.{TableQuery, Tag}
//import slick.memory.DistributedBackend
//import slick.model.Table
//import slick.driver.MySQLDriver.api._
//import scala.slick.driver.MySQLDriver.simple._
//
///**
//  * Created by dharshekthvel on 5/1/18.
//  */
//object ConnectToMySQL {
//
//
//  def main(args : Array[String]) = {
//
//    val db = DatabaseConfig.forConfig("database")
//
//    val coffees: TableQuery[Coffees] = TableQuery[Coffees]
//
//
//    try {
//
//      db.db.run(coffees.countDistinct);
//    }
//    finally {
//      db.db.close
//    }
//  }
//
//
//
//
//}
//
//
//case class Coffees(id: Int, name: String, supID: Int, price: Double)
//class CoffeesT(tag: Tag) extends Table[Coffees](tag, "COFFEES") {
//  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
//  def name = column[String]("COF_NAME")
//  def supID = column[Int]("SUP_ID")
//  def price = column[Double]("PRICE")
//  def * = (id, name, supID, price) <> (
//    (Coffees.apply _).tupled, Coffees.unapply)
//
//  //optional foreign key definition
//  def supplier = foreignKey("SUP_FK", supID, suppliers)(_.id)
//}