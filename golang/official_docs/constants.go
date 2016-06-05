/*
* @Author: Tasdik Rahman
* @Date:   2016-06-05 20:45:15
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-05 21:00:00
*/

package main

import (
    "fmt"
)

const s string = "This is a constant value"

func main() {
    fmt.Println(s)

    const d = 2016      // const keyword can come anywhere in place of the var
    fmt.Println(d)

    const e = 3123 / 23.1234
    fmt.Println(e)

    // const f = int64(e)
    // fmt.Println(f)
}