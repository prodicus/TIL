#!/bin/bash
du -a -b
echo "enter min val : "
read min

for file in $(ls)
do 
    size=`du -b $file | awk '{print $1}'`
    if [ $size -gt $min ]
    then
        echo "deleting file $file of size $size"
        rm $file
    fi
done