docker run --name opentrivia_db -d  -p 3306:33060 -v opentriviavolume:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=password  --rm mysql