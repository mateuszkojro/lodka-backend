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

echo "-- Add Organisation"
curl -X POST http://localhost:8080/organizations/add -H 'Content-Type: application/json' -d '{"id": 0, "organizationName": "string", "address": "string", "type": "foundation", "status": "active", "remarks": "string" }'

echo "-- Remove organization"
curl -X DELETE localhost:8080/organizations/delete/1

echo "-- Creating user id 0:"
curl -X POST http://localhost:8080/user-info/post \
     -H 'Content-Type: application/json' \
     -d '{"name":"Mateusz","surname":"Kojro","user_status": "active","email":"mateusz.maciej.kojro@cern.ch","phone_number":"2123"}'
     
echo "-- VOLUNTEERS TEST (user id 0 needed):"
echo "-- Geting all volunteers"
curl -X GET http://localhost:8080/volunteer/get

echo "-- Add Volunteer from user id 0:"
curl -X POST http://localhost:8080/volunteer/add -H 'Content-Type: application/json' -d '
{
"volunteerId": 0,
"organizationName": "org_name",
"birthday":"1998-05-19", 
"email": "email", 
"address": "adres",
"user_evaluation": "user_eval",
"account_verified": "True",
"paren_approved": "True"
}'

echo "-- Geting id 0 volunteer"
curl -X GET http://localhost:8080/volunteer/get/0

echo "-- Deleting id 0 volunteer"
curl -X GET http://localhost:8080/volunteer/delete/0

echo "-- Get the skills of a volunteer 0"
curl -X GET localhost:8080/volunteers/skills/0 -H accept: application/json
