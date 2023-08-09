package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Task3Tester extends FreeSpec with ChiselScalatestTester {
  "task3 Tester file" in {
    test(new mux_onehot_4to1) { a =>
        a.io.in.poke(1.U)
        // a.io.in1.poke(0.B)
        // a.io.in2.poke(0.B)
        // a.io.in3.poke(1.B)
        // a.io.sel.poke(1.U)
        a.clock.step(1)
        a.io.out1.expect(1.U)
        // a.io.out2.expect(0.U)



    }
  }
}
