package Classtask

import chisel3._
import chisel3.util._

class classtask3IO extends Bundle {
 
    val opcode = Input(UInt(3.W))
    val zero = Input(Bool())
    val mem_rd = Output(Bool())
    val load_ir = Output(Bool())
    val inc_pc = Output(Bool())
    val halt = Output(Bool())
    val reset=Input(Bool())
    val load_pc = Output(Bool())
    val load_ac = Output(Bool())
    val wr = Output(Bool())
  }
  class Acontroller extends Module{
      val io = IO(new classtask3IO)
            io.mem_rd:=0.B
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B
    var count = RegInit(1.U(4.W))
    when(count===9.U){
        count:=0.U
    }.otherwise{
        when(count===1.U){
            io.mem_rd:=0.B
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B
        } 
        when(count===2.U){
            io.mem_rd:=1.B
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B 
      
        }
           when(count===3.U){
            io.mem_rd:=1.B
            io.load_ir:=1.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B 
        }   
        when(count===4.U){
            io.mem_rd:=1.B
            io.load_ir:=1.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B 
           count := count + 1.U
      
        }   
        when(count===5.U){
            io.mem_rd:=0.B
            io.load_ir:=0.B;
            io.halt:=(io.opcode===0.U)
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B 
      
        }
           when(count===6.U){
            io.mem_rd:=(io.opcode===2.U||io.opcode===3.U||io.opcode===4.U||io.opcode===5.U)
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=0.B
            io.load_ac:=0.B
            io.load_pc:=0.B
            io.wr:=0.B 
      
        }
         when(count===7.U){
            io.mem_rd:=(io.opcode===2.U||io.opcode===3.U||io.opcode===4.U||io.opcode===5.U)
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=(io.opcode===1.U&&io.zero===1.B)
            io.load_ac:=(io.opcode===2.U||io.opcode===3.U||io.opcode===4.U||io.opcode===5.U)
            io.load_pc:=(io.opcode===7.U)
            io.wr:=0.B 
      
        }
         when(count===8.U){
            io.mem_rd:=(io.opcode===2.U||io.opcode===3.U||io.opcode===4.U||io.opcode===5.U)
            io.load_ir:=0.B;
            io.halt:=0.B
            io.inc_pc:=(io.opcode===7.U)
            io.load_ac:=(io.opcode===2.U||io.opcode===3.U||io.opcode===4.U||io.opcode===5.U)
            io.load_pc:=(io.opcode===7.U)
            io.wr:=(io.opcode===6.U)
      
        }
        count:=count+1.U

        
    }



  
  
  
}

