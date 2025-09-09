package org.example

class StringToInteger {
    fun myAtoi(s: String): Int {
        val trimStr = s.trim()
        if (trimStr.isEmpty()) return 0

        var currIndex = 0
        // 1 là số dương, -1 là số âm
        var currSign = 1
        var resultNumber = 0

        if (trimStr[currIndex] in setOf('+', '-')) {
            currSign = if (trimStr[0] == '+') 1 else -1
            currIndex++
        }

        while (currIndex < trimStr.length) {
            val currChar = trimStr[currIndex]
            if (!currChar.isDigit()) break

            val digit = currChar.digitToInt()

            // Đảm bảo resultNumber không vượt quá giới hạn của Int
            if (resultNumber > Int.MAX_VALUE / 10 ||
                (resultNumber == Int.MAX_VALUE / 10 && digit > 7)) return if (currSign == 1) Int.MAX_VALUE else Int.MIN_VALUE

            resultNumber = resultNumber * 10 + digit
            currIndex++
        }

        return resultNumber * currSign
    }


//    fun myAtoi2(s: String): Int {
//
//    }
}