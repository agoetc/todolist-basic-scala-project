package todolist.auth

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class EmailSpec extends AnyFreeSpec with Matchers {

  "email" - {

    "正しいemailの形" in {
      Email("a@a.a")
      succeed
    }

    "異常" - {
      "空" in {
        an[IllegalArgumentException] shouldBe thrownBy(Email(""))
      }

      "形おかしい" in {
        an[IllegalArgumentException] shouldBe thrownBy(Email("a@"))
      }
    }
  }
}
