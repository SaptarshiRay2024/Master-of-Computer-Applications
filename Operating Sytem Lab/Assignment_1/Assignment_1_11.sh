#!/bin/bash

echo "--- LOGGED IN USERS (CURRENTLY ACTIVE) ---"
who | awk '{print $1}' | sort -u

echo ""
echo "--- RECENTLY LOGGED OUT USERS ---"
last | grep "still logged in" -v | grep "wtmp begins" -v | awk '{print $1}' | grep . | sort -u