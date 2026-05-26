rm -f backup

for file in *
do
    if [ -f $file ]
    then
        if [ $file != backup ]
        then
            ls -l $file | awk '{print $9, $5, $1}' >> backup
        fi
    fi
done