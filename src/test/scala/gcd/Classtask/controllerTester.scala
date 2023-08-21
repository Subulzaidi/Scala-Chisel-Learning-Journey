package Classtask

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class controllerTester extends FreeSpec with ChiselScalatestTester {
  "task1 Tester file" in {
    test(new controller) { b =>
      b.io.zero.poke(false.B)
      b.io.opcode.poke(3.U)
      b.io.phase.poke(6.U)
      
      b.io.sel.expect(0.B)
      b.io.rd.expect(1.B)
      b.io.id_ir.expect(0.B)
      b.io.inc_pc.expect(0.B)
      b.io.halt.expect(0.B)
      b.io.id_pc.expect(0.B)
      b.io.data_e.expect(0.B)
      b.io.id_ac.expect(0.B)
      b.io.wr.expect(0.B)

      b.clock.step(1)
    }
  }
}
