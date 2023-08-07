package Lab1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Exercise1test extends FreeSpec with ChiselScalatestTester {
  "Counter Tester file" in {
    test(new counter(3)) { b =>
      b.clock.step(8)
      // b.io.result.expect(0.B)

    }
  }
}
