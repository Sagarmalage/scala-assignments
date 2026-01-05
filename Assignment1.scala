object Assignment1 {
  def main(args: Array[String]): Unit = {

    // 1. Even AND Positive
    val n1 = 28
    if (n1 > 0 && n1 % 2 == 0)
      println("1. Number is Even and Positive")
    else
      println("1. Number is NOT Even and Positive")


    // 2. Less than -10 OR Greater than 10
    val n2 = 13
    if (n2 < -10 || n2 > 10)
      println("2. Value is less than -10 OR greater than 10")
    else
      println("2. Value is between -10 and 10")


    // 3. Odd AND Not Divisible by 3
    val n3 = 17
    if (n3 % 2 != 0 && n3 % 3 != 0)
      println("3. Number is Odd and NOT divisible by 3")
    else
      println("3. Condition not satisfied")


    // 4. Divisible by 4 OR 6
    val n4 = 36
    if (n4 % 4 == 0 || n4 % 6 == 0)
      println("4. Number is divisible by 4 OR 6")
    else
      println("4. Number is NOT divisible by 4 OR 6")


    // 5. Eligible for Voting OR Driving
    val age5 = 17
    if (age5 >= 18 || age5 >= 16)
      println("5. Eligible for Voting OR Driving")
    else
      println("5. Not eligible")


    // 6. Number in range [1–10] OR [20–30]
    val n6 = 8
    if ((n6 >= 1 && n6 <= 10) || (n6 >= 20 && n6 <= 30))
      println("6. Number is in the given range")
    else
      println("6. Number is NOT in the range")


    // 7. Negative AND Odd
    val n7 = -15
    if (n7 < 0 && n7 % 2 != 0)
      println("7. Number is Negative and Odd")
    else
      println("7. Condition not satisfied")


    // 8. Senior OR Student Discount
    val age8 = 22
    if (age8 > 60 || age8 < 25)
      println("8. Eligible for Discount")
    else
      println("8. Not eligible for Discount")


    // 9. Divisible by 5 AND 7
    val n9 = 70
    if (n9 % 5 == 0 && n9 % 7 == 0)
      println("9. Number divisible by 5 and 7")
    else
      println("9. Condition not satisfied")


    // 10. Non-Negative OR Even
    val n10 = -3
    if (n10 >= 0 || n10 % 2 == 0)
      println("10. Number is Non-Negative OR Even")
    else
      println("10. Condition not satisfied")


    // 11. Prime AND Odd
    val n11 = 13
    var isPrime = true
    for (i <- 2 until n11)
      if (n11 % i == 0) isPrime = false

    if (isPrime && n11 % 2 != 0)
      println("11. Number is Prime and Odd")
    else
      println("11. Condition not satisfied")


    // 12. Discount OR Free Shipping
    val purchase12 = 155
    if (purchase12 > 150 || purchase12 > 100)
      println("12. Eligible for Discount or Free Shipping")
    else
      println("12. Not eligible")


    // 13. Divisible by 3 OR 8
    val n13 = 16
    if (n13 % 3 == 0 || n13 % 8 == 0)
      println("13. Number divisible by 3 or 8")
    else
      println("13. Condition not satisfied")


    // 14. Non-Positive AND Even
    val n14 = 0
    if (n14 <= 0 && n14 % 2 == 0)
      println("14. Number is Non-Positive and Even")
    else
      println("14. Condition not satisfied")


    // 15. Age Group Classification
    val age15 = 19
    if (age15 < 13)
      println("15. Child")
    else if (age15 <= 19)
      println("15. Teen")
    else
      println("15. Adult")


    // 16. Divisible by 2 OR 5
    val n16 = 40
    if (n16 % 2 == 0 || n16 % 5 == 0)
      println("16. Number divisible by 2 or 5")
    else
      println("16. Condition not satisfied")


    // 17. Senior AND Student (Impossible case)
    val age17 = 18
    if (age17 > 60 && age17 < 25)
      println("17. Eligible")
    else
      println("17. Condition impossible")


    // 18. Multiple of 3 AND 7
    val n18 = 42
    if (n18 % 3 == 0 && n18 % 7 == 0)
      println("18. Number divisible by 3 and 7")
    else
      println("18. Condition not satisfied")


    // 19. Divisible by 5 OR 9
    val n19 = 27
    if (n19 % 5 == 0 || n19 % 9 == 0)
      println("19. Number divisible by 5 or 9")
    else
      println("19. Condition not satisfied")


    // 20. Odd AND Not Divisible by 4
    val n20 = 9
    if (n20 % 2 != 0 && n20 % 4 != 0)
      println("20. Number is Odd and not divisible by 4")
    else
      println("20. Condition not satisfied")


    // 21. Divisible by 3 AND 5
    val n21 = 90
    if (n21 % 3 == 0 && n21 % 5 == 0)
      println("21. Number divisible by 3 and 5")
    else
      println("21. Condition not satisfied")


    // 22. Discount OR Membership
    val purchase22 = 140
    val loyalty = true
    if (purchase22 > 200 || loyalty)
      println("22. Eligible for Discount or Membership benefit")
    else
      println("22. Not eligible")


    // 23. Divisible by 2 OR 3
    val n23 = 4
    if (n23 % 2 == 0 || n23 % 3 == 0)
      println("23. Number divisible by 2 or 3")
    else
      println("23. Condition not satisfied")


    // 24. Positive AND Not Divisible by 3
    val n24 = 10
    if (n24 > 0 && n24 % 3 != 0)
      println("24. Number is Positive and not divisible by 3")
    else
      println("24. Condition not satisfied")


    // 25. Senior AND Not New Customer
    val age25 = 68
    val newCustomer = false
    if (age25 > 65 && !newCustomer)
      println("25. Eligible for Senior Discount")
    else
      println("25. Not eligible")


    // 26. Odd OR Prime
    val n26 = 9
    var prime26 = true
    for (i <- 2 until n26)
      if (n26 % i == 0) prime26 = false

    if (n26 % 2 != 0 || prime26)
      println("26. Number is Odd or Prime")
    else
      println("26. Condition not satisfied")


    // 27. Discount AND Free Shipping
    val purchase27 = 180
    if (purchase27 > 150 && purchase27 > 100)
      println("27. Eligible for Discount and Free Shipping")
    else
      println("27. Not eligible")


    // 28. Non-Negative AND Not Divisible by 7
    val n28 = 9
    if (n28 >= 0 && n28 % 7 != 0)
      println("28. Number is Non-Negative and not divisible by 7")
    else
      println("28. Condition not satisfied")


    // 29. Student Discount OR Free Trial
    val age29 = 27
    val freeTrial = true
    if (age29 < 25 || freeTrial)
      println("29. Eligible for Student Discount or Free Trial")
    else
      println("29. Not eligible")


    // 30. Divisible by 4 OR 6
    val n30 = 12
    if (n30 % 4 == 0 || n30 % 6 == 0)
      println("30. Number divisible by 4 or 6")
    else
      println("30. Condition not satisfied")

  }
}
