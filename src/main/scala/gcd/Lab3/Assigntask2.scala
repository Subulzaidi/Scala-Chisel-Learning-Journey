package gcd.Lab3

import chisel3 . _
import chisel3 . util . _
class LM_IO_Interface_decoder_with_valid extends Bundle {
val in = Input ( UInt (2. W ) )
val out = Valid ( Output ( UInt (4. W ) ) )
}
class decoder_with_valid extends Module {
val io = IO (new LM_IO_Interface_decoder_with_valid )
// Start coding here
when ( io . in === "b00 ". U ) {
io . out := " b0001 ". U
} .elsewhen ( io . in === "b01". U ) {
io . out := " b0010 ". U
} .elsewhen ( io . in === "b10". U ) {
io . out := " b0100 ". U
} .otherwise {
io . out := " b1000 ". U
}
// End coding here
}