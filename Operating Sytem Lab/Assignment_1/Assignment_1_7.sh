#!/bin/bash

pos_count=0
neg_count=0

for num in $*
do
    if [ $num -gt 0 ]
    then
        pos_count=$((pos_count + 1))
    elif [ $num -lt 0 ]
    then
        neg_count=$((neg_count + 1))
    fi
done

echo Positive numbers: $pos_count
echo Negative numbers: $neg_count