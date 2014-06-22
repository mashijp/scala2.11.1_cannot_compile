import org.specs2.mutable.Specification
import tekito.Fuga

class Test extends Specification {

  "" should {
    "" in {
      val log = Fuga(
        id = 1234L,
        bId = Some(46L)
      )
      // Cannot compile
      val bId = log.id
      // Can compile
//      val i = log.id
      todo
    }
  }
}
