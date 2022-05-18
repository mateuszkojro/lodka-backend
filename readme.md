# Build & Run

## Database In memory

Odkomentuj linijki w `src/main/resources/application.properties`

## Docker i Postgress
Wymagany docker: [Docker desktop](https://www.docker.com/)

Startowanie bazy danych

```bash
docker-compose up -d
```

Interfejs administratora na `localhost:8000`
- system: `postgress`
- username: `admin`
- password: `pssd123`
- database: `lodka`