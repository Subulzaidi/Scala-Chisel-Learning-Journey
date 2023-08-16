package Lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class L3Task1Tester extends FreeSpec with ChiselScalatestTester {
  "task1 Tester file" in {
    test(new Encoder4to2) { b =>
        b.io.in.poke("b0100".U)
        b.io.out.expect("b10".U)
        b.clock.step(1)



    }
  }
}
