object Assignment2 {
  def main(args: Array[String]): Unit = {

    // 1. Convert Kilograms to Grams
    val kg = 82
    println("1. Weight in grams = " + (kg * 1000))

    // 2. Celsius to Fahrenheit
    val celsius = 35
    println("2. Temperature in Fahrenheit = " + ((celsius * 9 / 5) + 32))

    // 3. Largest of Three Numbers
    val x = 45
    val y = 68
    val z = 33
    println("3. Largest number = " + Math.max(x, Math.max(y, z)))

    // 4. Conditional Number Evaluation
    val num4 = 721
    if (num4 < 150 || num4 > 950)
      println("4. Invalid number")
    else if (num4 % 2 == 0)
      println("4. Even number remainder = " + (num4 % 4))
    else
      println("4. Odd number remainder = " + (num4 % 3))

    // 5. Range & Labeling
    val score = 75
    if (score < 0 || score > 100)
      println("5. Invalid input")
    else if (score >= 90)
      println("5. Genius")
    else if (score >= 80)
      println("5. Excellent")
    else if (score >= 70)
      println("5. Very Good")
    else if (score >= 60)
      println("5. Good")
    else if (score >= 40)
      println("5. Average")
    else
      println("5. Fail")

    // 6. Simple Calculator
    val a = 25
    val b = 6
    val op = '%'
    op match {
      case '+' => println("6. Result = " + (a + b))
      case '-' => println("6. Result = " + (a - b))
      case '*' => println("6. Result = " + (a * b))
      case '/' => println("6. Result = " + (a / b))
      case '%' => println("6. Result = " + (a % b))
    }

    // 7. Print Phrase 75 Times
    for (i <- 1 to 75)
      println("7. LEARN SCALA PYTHON")

    // 8. Numbers Divisible by 14 (120–360)
    print("8. ")
    for (i <- 120 to 360 if i % 14 == 0)
      print(i + " ")
    println()

    // 9. Sum of Numbers 60 to 170
    var sum9 = 0
    for (i <- 60 to 170)
      sum9 += i
    println("9. Sum = " + sum9)

    // 10. Even Numbers 350 to 500
    print("10. ")
    for (i <- 350 to 500 if i % 2 == 0)
      print(i + " ")
    println()

    // 11. Odd Numbers 401 to 201
    print("11. ")
    for (i <- 401 to 201 by -1 if i % 2 != 0)
      print(i + " ")
    println()

    // 12. Count Even Numbers 45 to 145
    var count = 0
    for (i <- 45 to 145 if i % 2 == 0)
      count += 1
    println("12. Even count = " + count)

    // 13. Alternate Even Numbers from 36
    print("13. ")
    for (i <- 36 to 140 by 4)
      print(i + " ")
    println()

    // 14. Alternate Even Numbers from 38
    print("14. ")
    for (i <- 38 to 140 by 4)
      print(i + " ")
    println()

    // 15. Multiplication Pattern
    for (i <- 3 to 15)
      println("15. " + i + " * " + (i + 1) + " = " + (i * (i + 1)))

    // 16. Sum of Even Numbers 280 to 480
    var sum16 = 0
    for (i <- 280 to 480 if i % 2 == 0)
      sum16 += i
    println("16. Sum = " + sum16)

    // 17. Print Alphabets
    print("17. ")
    for (c <- 'a' to 'z')
      print(c + " ")
    println()

    // 18. Average of Series 28 to 96
    var sum18 = 0
    var count18 = 0
    for (i <- 28 to 96 by 2) {
      sum18 += i
      count18 += 1
    }
    println("18. Average = " + (sum18 / count18))

    // 19. Sum of Squares
    var sum19 = 0
    for (i <- 55 to 95 by 2)
      sum19 += i * i
    println("19. Sum of squares = " + sum19)

    // 20. Print A and B Alternately
    for (i <- 1 to 100)
      if (i % 2 == 0) print("B ") else print("A ")
    println()

    // 21. Pattern n@(n-1)
    for (i <- 18 to 1 by -1)
      println("21. " + i + "@" + (i - 1))

    // 22. Series of 250
    print("22. ")
    for (i <- 250 to 10000 by 250)
      print(i + " ")
    println()

    // 23. Odd Squares
    for (i <- 13 to 29 by 2)
      println("23. " + i + "^2 = " + (i * i))

    // 24. Alternating 6 and 12
    for (i <- 1 to 7)
      if (i % 2 == 0) print("12 ") else print("6 ")
    println()

    // 25. Decreasing Multiplication
    for (i <- 4 to -10 by -1)
      println("25. 6 * " + i + " = " + (6 * i))

    // 26. Even-Odd Label
    for (i <- 1 to 33)
      if (i % 2 == 0) print("even ") else print(i + " ")
    println()

    // 27. Factor of Five
    for (i <- 1 to 30)
      if (i % 5 == 0) print("factor of five ")
      else print(i + " ")
    println()

    // 28. Divisible by 4
    for (i <- 1 to 25)
      if (i % 4 == 0) print("divisible by 4 ")
      else print(i + " ")
    println()

    // 29. Floating Point Square
    for (i <- 6 to 46 by 2) {
      val v = i / 10.0
      println("29. " + v + "^2 = " + (v * v))
    }

    // 30. Infinite Loop (disabled)
    while (false) {
      println("30. Infinite Loop")
    }
  }
}
