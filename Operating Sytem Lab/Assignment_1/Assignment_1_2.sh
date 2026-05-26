for file in *
do
    lowercase=$(echo $file | tr '[A-Z]' '[a-z]')
    if [ $file != $lowercase ]
    then
        mv $file $lowercase
    fi
done