package fundamentum
package laws

import org.typelevel.discipline.scalatest.Discipline
import org.scalatest.FunSuite

import fundamentum.instances._

class LawTests extends FunSuite with Discipline {
  checkAll("List", ApplyLaws[List].apply)
  checkAll("Option", ApplyLaws[Option].apply)
}
