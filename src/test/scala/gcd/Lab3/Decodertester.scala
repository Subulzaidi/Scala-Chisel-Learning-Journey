package gcd.Lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class DecoderTester extends FreeSpec with ChiselScalatestTester {
    "Testing" in{
        test(new decoder_with_valid) {b=>
            b.io.in.poke("b00".U)
            // b.io.out.expect()
            b.clock.step(1)
            }

    }
}

