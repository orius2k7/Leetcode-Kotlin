package org.example

class ZigzagConversion {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || numRows >= s.length) return s

        val rows = MutableList(minOf(numRows, s.length)) { "" }
        var currRow = 0
        // 1 for down, -1 for up
        var currDir = 1

        for (char in s) {
            rows[currRow] += char
            if (currRow == 0) currDir = 1
            else if (currRow == numRows - 1) currDir = -1
            currRow += currDir
        }

        return rows.joinToString("")
    }
}