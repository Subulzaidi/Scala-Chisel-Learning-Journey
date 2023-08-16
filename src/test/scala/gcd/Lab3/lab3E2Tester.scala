package Lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class L3Task2Tester extends FreeSpec with ChiselScalatestTester {
  "task1 Tester file" in {
    test(new ALU) { b =>
        b.io.in_A.poke(23.U)
        b.io.in_B.poke(23.U)
        b.io.alu_Op.poke(0.U)
        b.io.out.expect(46.U)
        b.io.sum.expect(46.U)
        b.clock.step(1)



    }
  }
}
