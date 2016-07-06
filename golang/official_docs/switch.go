/*
* @Author: Tasdik Rahman
* @Date:   2016-06-06 09:15:23
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-06 09:49:31
*/

package main

import "fmt"
import "time"

func main() {
    i := 2
    switch i {
        case 1:
            fmt.Println("This will not get printed")
        case 2:
            fmt.Println(i, " is the number")
        case 3:
            fmt.Println(i, " not this number")
    }

    // time for somthing less obvious

    switch time.Now().Weekday() {
        case time.Saturday, time.Sunday:
            fmt.Println("It is a weekday")
        case time.Monday:
            fmt.Println("It is a monday for god's sake")
        default:
            fmt.Println("It is a working day")
    }

    // showing thaht the case statements need not be constants

    t := time.Now()
    fmt.Println(t)
    switch {
        case t.Hour() < 12:
            fmt.Println("Good morning!")
        default:
            fmt.Println("Good afternoon!")
    }
}