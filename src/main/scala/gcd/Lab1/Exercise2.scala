package Lab1

import chisel3._
import chisel3.util._

class counterMSB(counterBits: Int) extends Module {
  val io = IO(new Bundle {
    val result = Output(Bool())
  })
  // val counterBits = Wire(SInt())
  var max = ((1.U << counterBits))

  var count = RegInit(0.U(4.W))

  when(max === count) {
    count := 0.U
  }.otherwise {
    count := count + 1.U

  }

  io.result := count(3.U)
  println(s" counter created with max value $max ")

}
