#!/bin/bash

target_dir=$1

for path in $target_dir*
do
    if [ -f $path ]
    then
        dir_part=$(dirname $path)
        base_part=$(basename $path)
        
        lowercase_base=$(echo $base_part | tr '[A-Z]' '[a-z]')
        lowercase_path=$dir_part/$lowercase_base
        
        if [ $base_part != $lowercase_base ]
        then
            if [ -e $lowercase_path ]
            then
                echo "Warning: Not overwriting $lowercase_base"
            else
                mv $path $lowercase_path
            fi
        fi
    fi
done