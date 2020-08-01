package ch04.section02

//Enter the lines: 5
//*
//***
//*****
//*******
//*********

fun main() {
    print("Enter the lines: ")
    var num = readLine()!!.toInt() // 줄 수 입력 받기

    for (line in 1..num) {
        for (space in 1..num - line) {
            print(" ")
        }
        for (star in 1 until 2 * line) {
            print("*")
        }
        println()
    }


}