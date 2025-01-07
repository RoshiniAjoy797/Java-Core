package com.example.BitWise_Operators;

public class BitwiseLogical {
	public static void main(String[] args) {
		String binary[] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		/*
		 * a = 120 in decimal is 01111000 in binary (8 bits). 0x0f is 00001111 in binary
		 * (4 bits). The 0x prefix signifies a hexadecimal value, and 0x0f represents
		 * the hexadecimal value for 15, which is 00001111 in binary. The bitwise AND
		 * operation (&) compares each corresponding bit of a and 0x0f:
		 * 
		 * a = 01111000 0x0f = 00001111 The result of the AND operation (&) will only
		 * keep the bits where both operands have 1. Let's do the AND operation bit by
		 * bit:
		 * 
		 * 01111000 & 00001111 `------------
		 */
		int a = 12;// if int a = 120; -- 0+64+32+16+8+0+0+0 or 01111000 in binary - (8 bits).
		int b = 6;// 4 + 2 + 0 or 0110 in binary
		int c = a | b; // bitwise OR
		int d = a & b; // bitwise AND
		int e = a ^ b; // bitwise XOR
		int f = (~a & b) | (a & ~b); // ~ Unary NOT
		int g = ~a & 0x0f; // 0x0f is 0+0+0+0+1+1+1+1 - (4 bits) below ref

		/*
		 * since -- '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
		 * 'd', 'e', 'f'
		 * 
		 */
		System.out.println(" a = " + binary[a]);
		System.out.println(" b = " + binary[b]);
		System.out.println(" a|b = " + binary[c]);
		System.out.println(" a&b = " + binary[d]);
		System.out.println(" a^b = " + binary[e]);
		System.out.println("~a&b|a&~b = " + binary[f]);
		System.out.println(" ~a & 0x0f = " + binary[g]);
		System.out.println(10 >> 2); // 10/2^2=10/4=2 ---- Shift right
		System.out.println(20 >> 2); // 20/2^2=20/4=5
		System.out.println(20 >> 3); // 20/2^3=20/8=2

		byte m = 64;
		byte n; // 0+64+0+0+0+0+0+0 or (128,64,32,16,8,4,2,1) is 01000000 = 8 bits
		int i = m << 2; //Shift left
		/*
		 * Initial Value of a:
		 * 
		 * a = 64 (which is a byte). In binary, 64 is represented as 01000000 in 8 bits.
		 * Left Shift Operation (a << 2):
		 * 
		 * a << 2 means we are shifting the bits of a (64) to the left by 2 positions.
		 * This is equivalent to multiplying the number by 2 2 = 4 2 2 =4.
		 * 
		 * So, a << 2 would be:
		 * 
		 * 64 << 2 = 64 * 4 = 256 In binary, 256 is represented as 100000000 (which is 9
		 * bits). Now, 256 in 9 bits is 100000000, but we are working with a byte (which
		 * is 8 bits in Java). This means the 9th bit (leftmost bit) will be discarded
		 * because a byte can only hold values from -128 to 127.
		 * 
		 * Byte Overflow:
		 * 
		 * When we cast 256 to a byte, it overflows because 256 is outside the range of
		 * a byte (which can only store values from -128 to 127). In 8-bit binary, 256
		 * is represented as 100000000. If we take the lower 8 bits, we get: code
		 * 00000000 (in 8 bits) This is 0 in decimal.
		 * 
		 */
		n = (byte) (m << 2);
		System.out.println("Original value of m: " + m);
		System.out.println("i and n : " + i + " and  " + n);
		n = (byte) (m << 1); // 10000000
		System.out.println("n : " + n);
		/*
		 * A byte in Java is an 8-bit (1-byte) signed data type. It has a range of
		 * values from -128 to 127. Positive numbers: 0 to 127 (binary 00000000 to
		 * 01111111). Negative numbers: -1 to -128 (binary 11111111 to 10000000 in two's
		 * complement representation).
		 * 
		 * Two's complement is a system for representing signed integers where:
		 * 
		 * The most significant bit (MSB) is the sign bit: 0 means the number is
		 * positive. 1 means the number is negative. The magnitude of a negative number
		 * is obtained by: Taking the binary representation of the positive number. Flip
		 * all the bits (1 becomes 0, and 0 becomes 1). Adding 1 to the result.
		 * 
		 * Example : 10000000 -> Flip bits -> 01111111 01111111 + 1 = 10000000. This
		 * confirms 10000000 is -128 in two's complement. Signed 8-bit range: -128 to
		 * 127. MSB (1) in 10000000 indicates it’s a negative number. 10000000 cannot
		 * represent a positive number because its value has wrapped around the range to
		 * the lowest possible negative value (-128).
		 * 
		 * In signed representation, the most significant bit (MSB) is the sign bit: 0 =
		 * Positive number. 1 = Negative number.
		 * 
		 * Why Does 128 Become -128? Binary Representation of 128 (int):
		 * 
		 * 128 in binary (as int) = 00000000 00000000 00000000 10000000 (32 bits)
		 * 
		 * Casting to byte (-128 to 127): +ve num range ----> 00000000 to 01111111 (1 to
		 * 127) -ve num range ----> 11111111 to 10000000 (-1 to -128) Only the last 8
		 * bits are kept because byte is 8 bits wide: 10000000 This binary 10000000
		 * represents -128 in two's complement. Interpreting 10000000 as Two's
		 * Complement:
		 * 
		 * Flip the bits: 01111111 Add 1: 10000000 Result: -128
		 * 
		 */
		
		// Bitwise operator compound assignments
		int u = 1;
		int v = 2;
		int w = 3;
		u |= 4;
		v >>= 1; 
		w <<= 1;
		u ^= w;
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);
		
	}
}
