
package Lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class AssignTask1t extends FreeSpec with ChiselScalatestTester {
  "task1 Tester file" in {
    test(new BranchControl) { b =>
        b.io.branch.poke(1.B)
         b.io.fnct3.poke(2.U)
         b.io.arg_x.poke(23.U)
         b.io.arg_y.poke(23.U)
        b.io.br_taken.expect(0.B)
        b.clock.step(1)



    }
  }
}
