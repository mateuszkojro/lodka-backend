set -xe

echo "-- Creating user:"

curl -X POST http://localhost:8080/user-info/post \
     -H 'Content-Type: application/json' \
     -d '{"name":"Mateusz","surname":"Kojro","user_status": "active","email":"mateusz.maciej.kojro@cern.ch","phone_number":"2123"}'

echo "-- Getting user:"
curl -X GET http://localhost:8080/user-info/get/1

echo "-- Adding skills"
curl -X POST http://localhost:8080/user-skills/post/1 \
     -H 'Content-Type: application/json' \
     -d '{"skill": "running"}'

echo "-- Geting skills"
curl -X GET http://localhost:8080/user-skills/get/1

