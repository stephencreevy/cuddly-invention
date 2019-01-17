import org.scalatest._
package BowlingApp

class BowlingGameScenarioTest extends FlatSpec with Matchers {

  "First bowl" should "store skittles as bowl1 and () as bowl2" in {
    val game = new BowlingAppForUnitTest()
    game.bowl(4)
    game.games(0).bowl1 should be(4)
  }

  "Second bowl" should "set skittles as bowl2 to the last bowls element" in {
    val game = new BowlingGame
    game.bowl(4)
    game.bowl(2)
    game.games(0).bowl1 should be(4)
    game.games(0).bowl2 should be(2)
  }

  "Four roles" should "be stored as two frame elements" in {
    val game = new BowlingGame
    game.bowl(1)
    game.bowl(2)
    game.bowl(3)
    game.bowl(4)
    game.games(0).bowl1 should be(1)
    game.games(0).bowl2 should be(2)
    game.games(1).bowl1 should be(3)
    game.games(1).bowl2 should be(4)
  }

  "Score" should "be sum of all roles" in {
    val game = new BowlingGame
    game.bowl(1)
    game.bowl(2)
    game.bowl(3)
    game.bowl(4)
    game.bowl(5)
    game.bowl(4)
    game.score should be(1 + 2 + 3 + 4 + 5 + 4)
  }

  "Strike" should "set 0 as bowl2" in {
    val game = new BowlingGame
    game.bowl(10)
    game.games(0).bowl1 should be(10)
  }
}
