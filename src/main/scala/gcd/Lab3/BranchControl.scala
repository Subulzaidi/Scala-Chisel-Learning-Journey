package lab3
import chisel3._
import chisel3.util._
class LM_IO_Interface_BranchControl extends Bundle {
  val fnct3 = Input(UInt(3.W))
  val branch = Input(Bool())
  val arg_x = Input(UInt(32.W))
  val arg_y = Input(UInt(32.W))
  val br_taken = Output(Bool())
}
class BranchControl extends Module {
  val io = IO(new LM_IO_Interface_BranchControl)
// Start Coding here

  when(io.branch === 1.U) {
    io.br_taken := MuxLookup(
      io.fnct3,
      false.B,
      Array(
        (0.U) -> (io.arg_x === io.arg_y),
        (1.U) -> (~(io.arg_x === io.arg_y)),
        (4.U) -> (io.arg_x.asSInt < io.arg_y.asSInt()),
        (5.U) -> (io.arg_x.asSInt >= io.arg_y.asSInt()),
        (6.U) -> (io.arg_x < io.arg_y),
        (7.U) -> (io.arg_x >= io.arg_y)
      )
    )
  }.otherwise {
    io.br_taken := false.B
  }
// End your code here

}
