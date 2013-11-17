package models

import java.util.Date
import anorm.SQL
import anorm.SqlQuery
import play.api.db.DB


case class League(name: String, groups: List[Group], startDate: Date, endDate: Date)

object League {
  val find_all: SqlQuery = SQL("select * leagues order by endDate desc")

  def all: List[Product] = DB.withConnection {
    implicit connection =>
      find_all().map(row =>
        League(row[String]("name"), null, row[Date]("startDate"), row[Date]("endDate")))
      ￼￼￼￼￼￼￼￼
  }

  def create(league: League): Boolean =
    DB.withConnection {
      implicit connection =>
        val addedRows = SQL( """insert
         into leagues
         values ({name}, {startDate}, {endDate})""").on(
          "name" -> league.name,
          "startDate" -> league.startDate,
          "endDate" -> league.endDate
        ).executeUpdate()
        addedRows == 1
    }
}