echo -n "Enter username: "
read username

if grep ^$username: /etc/passwd
then
    echo "User information displayed above."
else
    echo "User $username not found."
fi