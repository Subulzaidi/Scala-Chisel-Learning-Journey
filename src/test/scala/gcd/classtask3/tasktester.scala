// package classtask3

// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//  import Practice.chisel
//  import classTask3.Acontroller
 

// class tasktester extends FreeSpec with ChiselScalatestTester {
//   "task1 Tester file" in {
//     test(new Acontroller) { b =>
//       b.io.zero.poke(true.B)
//       b.io.opcode.poke(7.U)
//       b.io.reset.poke(0.B)
//       b.io.mem_rd.expect(0.B)
//       b.io.load_ir.expect(0.B)
//       b.io.halt.expect(0.B)
//       b.io.inc_pc.expect(0.B)
//       b.io.load_ac.expect(0.B)
//       b.io.load_pc.expect(0.B)
//       b.io.wr.expect(0.B)

//       b.clock.step(9)

//     }
//   }

// }
