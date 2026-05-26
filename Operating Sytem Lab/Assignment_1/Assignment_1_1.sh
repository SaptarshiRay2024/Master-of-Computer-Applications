current_hour=$(date +%H)
if [ $current_hour -ge 5 ] && [ $current_hour -lt 12 ]
then
    echo "GOOD MORNING!"
elif [ $current_hour -ge 12 ] && [ $current_hour -lt 17 ]
then
    echo "GOOD AFTERNOON!"
elif [ $current_hour -ge 17 ] && [ $current_hour -lt 21 ]
then
    echo "GOOD EVENING!"
else
    echo "GOOD NIGHT!"
fi