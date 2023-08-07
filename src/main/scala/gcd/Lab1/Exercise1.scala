package Lab1

import chisel3._
import chisel3.util._

class counter(counterBits: Int) extends Module {
  val io = IO(new Bundle {
    // val result = Output(Bool())
  })
  // val counterBits = Wire(SInt())
  var max = ((1.U << counterBits) - 1.U).asSInt

  var count = RegInit((0.U(4.W)).asSInt)

  when(max === count) {
    count := 0.S
  }.otherwise {
    count := count + 1.S

  }

  // io.result := count(1.B)
  println(s" counter created with max value $max ")

}
