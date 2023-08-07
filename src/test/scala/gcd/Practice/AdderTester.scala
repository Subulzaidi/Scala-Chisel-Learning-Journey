package Practice

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class AdderTester extends FreeSpec with ChiselScalatestTester {
  "Adder Tester file" in {
    test(new chiselAdder) { b =>
      b.io.in1.poke(1.U)
      b.io.in2.poke(1.U)
      b.clock.step(1)
      b.io.out.expect(2.U)

    }
  }
}
