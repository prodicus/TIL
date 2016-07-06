/*
* @Author: Tasdik Rahman
* @Date:   2016-06-06 14:46:28
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-06 14:48:07
*/

package main

import "fmt"

func swap(x, y string) (string, string) {
    return y, x
}

func main() {
    a, b := "Tasdik", "Rahman"
    fmt.Println(swap(a, b))
}