lines=0
words=0

while read line
do
    lines=$((lines + 1))
    
    for word in $line
    do
        words=$((words + 1))
    done
done

echo Lines: $lines
echo Words: $words