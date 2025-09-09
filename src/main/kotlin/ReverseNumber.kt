package org.example

class ReverseNumber {

    fun reverse(x: Int): Int {
        var num: Int = x
        var reverseNumber: Int = 0

        while (num != 0) {
            val remainder = num % 10

            // Đảm bảo reverseNumber không vượt quá giới hạn của Int
            if (reverseNumber > Int.MAX_VALUE / 10 ||
                (reverseNumber == Int.MAX_VALUE / 10 && remainder > 7)) return 0
            if (reverseNumber < Int.MIN_VALUE / 10 ||
                (reverseNumber == Int.MIN_VALUE / 10 && remainder < -8)) return 0

            reverseNumber = reverseNumber * 10 + remainder
            num /= 10
        }

        return reverseNumber
    }
}