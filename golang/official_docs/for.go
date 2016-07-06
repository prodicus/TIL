/*
* @Author: Tasdik Rahman
* @Date:   2016-06-05 21:00:19
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-05 21:34:50
*/

package main

import "fmt"


// We only have for loops in golang

func main(){

    i := 1
    for i <= 3 {
        i = i + 1
        fmt.Println(i)
    }

    for j:=1; j <= 10; j++ {
        fmt.Println(j)
    }

    for {
        fmt.Println("1st print")
        fmt.Println("2nd print")
        break
    }
}