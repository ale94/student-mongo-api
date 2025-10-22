# Student Mongo API

Una API REST sencilla con Spring Boot para gestionar estudiantes, creada para practicar la integración con **MongoDB** y el despliegue con **Docker**.

## Tecnologías

- Java 21
- Spring Web
- Spring Data MongoDB
- Spring Devtools
- Lombok
- Docker

## Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/ale94/student-mongo-api.git
cd student-mongo-api
```

2. Configurar las variables de entorno para MongoDB en un archivo .env:
```bash
MONGO_USERNAME=root
MONGO_PASSWORD=example
MONGO_DATABASE=students_db
```

3. Levantar los contenedores con Docker:
```bash
docker compose up
```

4. Ejecutar la aplicación Spring Boot:
```bash
./mvnw spring-boot:run
```

## Endpoints principales
- GET /students → Listar todos los estudiantes
- GET /students/{id} → Obtener estudiante por ID
- POST /students → Crear nuevo estudiante
- DELETE /students/{id} → Eliminar estudiante

## Datos de ejemplo
Al iniciar la aplicación, se cargan algunos estudiantes de ejemplo en MongoDB mediante un script de inicialización (init-mongo.js).
