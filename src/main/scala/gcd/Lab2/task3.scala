package Lab2
import chisel3._
import chisel3.util._

class mux_onehot_4to1 extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(4.W))
    // val in1 = Input(UInt(32.W))
    // val in2 = Input(UInt(32.W))
    // val in3 = Input(UInt(32.W))
    // val sel = Input(UInt(2.W))
    val out1 = Output(UInt(32.W))
    // val out2 = Output(UInt(32.W))
  })
  
  io.out1 := Mux1H(io.in, Seq(0.U, 1.U, 2.U, 3.U))
}
