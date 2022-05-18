# IMPORTANT: Robcie prosze pull requesty

# Build & Run

## Setup

### Database In memory

Odkomentuj linijki w `src/main/resources/application.properties`

### Docker i Postgress
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


## Co i jak 

Lista kod do generowania endpointow jest w pliku swagger.yml wystarczy wkleic go na [strone](https://editor.swagger.io/).
Podglad inputow i outputow pokaze sie po rozwinieciu.

Pod [tym](https://docs.google.com/spreadsheets/d/1iFxnmrdxcErlp33KKHPPAgHhBj0l5_qC33To8ZyCWrI/edit#gid=0) linkiem jest tabelka imie i nazwisko -> endpoint. Wpisz siebie i swoj ulubiony and go ahead. Przyklady beznadziejnych implementacji sa w repo.
