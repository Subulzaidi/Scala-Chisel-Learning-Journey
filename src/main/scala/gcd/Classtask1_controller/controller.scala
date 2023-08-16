package task_controller

import chisel3._
import chisel3.util._

class controller extends Module {
  val io = IO(new Bundle {
    val opcode = Input(UInt(3.W))
    val phase = Input(UInt(3.W))
    val zero = Input(Bool())
    val sel = Output(Bool())
    val rd = Output(Bool())
    val id_ir = Output(Bool())
    val inc_pc = Output(Bool())
    val halt = Output(Bool())
    val id_pc = Output(Bool())
    val data_e = Output(Bool())
    val id_ac = Output(Bool())
    val wr = Output(Bool())
  })
  
  // sel
  io.sel :=
    (io.phase === 0.U || io.phase === 1.U || io.phase === 2.U || io.phase === 3.U)

  // rd
  io.rd := ((io.phase === 1.U || io.phase === 2.U || io.phase === 3.U) || (io.phase === 5.U || io.phase === 6.U || io.phase === 7.U) && (io.opcode === 2.U || io.opcode === 3.U || io.opcode === 4.U || io.opcode === 5.U))
  io.id_ir := (io.phase === 2.U || io.phase === 3.U)
  // io.inc_pc
  io.inc_pc := (io.phase === 4.U || (io.phase === 6.U && io.zero === 0.U && io.opcode === 1.U))
  // halt
  io.halt := (io.phase === 4.U)
  // Id_pc
  io.id_pc := ((io.phase === 6.U || io.phase === 7.U) && (io.opcode === 7.U))

  // data_e
  io.data_e := ((io.phase === 6.U || io.phase === 7.U) && (io.opcode === 6.U))
  // id_ac
  io.id_ac := (io.phase === 7.U && (io.opcode === 2.U || io.opcode === 3.U || io.opcode === 4.U || io.opcode === 5.U))
  // wr
  io.wr := (io.phase === 7.U && io.opcode === 6.U)

}
