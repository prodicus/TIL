/*
* @Author: Tasdik Rahman
* @Date:   2016-06-04 19:41:15
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-04 22:24:42
*/

package main

import "fmt"

func main(){
    var a string = "initial string value"
    fmt.Println(a)

    var b string    // prints nothing
    fmt.Println(b)

    var c, d int = 10, 112
    fmt.Println(c, d)

    var e int    // defaults to zero in this case
    fmt.Println(e)

    f := "shorthand"    // stands for shorthand initialization
    fmt.Println(f)
}