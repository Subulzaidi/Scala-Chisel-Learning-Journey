package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class ATask2Tester extends FreeSpec with ChiselScalatestTester {
  "task1 Tester file" in {
    test(new barrel_shift) { b =>
        b.io.in(0).poke(0.B)
        b.io.in(1).poke(0.B)
        b.io.in(2).poke(1.B)
        b.io.in(3).poke(1.B)
        b.io.sel(0).poke(0.B)
        b.io.sel(1).poke(1.B)
        b.io.shift_type.poke(0.B)
        b.clock.step(1)
        b.io.out(0).expect(1.B)
        b.io.out(1).expect(1.B)
        b.io.out(2).expect(0.B)
        b.io.out(3).expect(0.B)



    }
  }
}
