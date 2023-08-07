package Lab1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class AssignmentTest extends FreeSpec with ChiselScalatestTester {
  "Counter Tester file" in {
    test(new counterex4(3)) { b =>
      b.io.data_in.poke(5.U)
      b.clock.step(8)
      b.io.reload.poke(1.B)
      b.io.out.expect(0.B)

    }
  }
}
