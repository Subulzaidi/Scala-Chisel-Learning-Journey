package Lab1
import chisel3._
import chisel3.util._

class counterex4(n: Int) extends Module {
  val io = IO(new Bundle {
    val data_in = Input(UInt(n.W))
    val reload = Input(Bool())
    val out = Output(Bool())
  })
  val counter = RegInit(0.U(n.W))
  val max_count = RegInit(6.U(n.W))
// Your code

  when(io.data_in === max_count) {
    counter := counter - 1.U
  }.otherwise {
    counter := counter + 1.U

  }
  io.out := counter(3.U)
}
