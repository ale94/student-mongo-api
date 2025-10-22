db.students.insertMany([
    {
        studentId: "STU001",
        name: "Alejandro Rua",
        email: "alejandro.rua@example.com",
        age: 25,
        gender: "Male",
        course: "Backend Development",
        gpa: 8.7,
        skills: ["Java", "Spring Boot", "SQL", "Docker"],
        enrollmentDate: ISODate("2024-03-15T00:00:00Z"),
        status: "active",
        address: {
            street: "123 Main Street",
            city: "Buenos Aires",
            country: "Argentina"
        },
        phone: "+54 9 11 5555-1111"
    },
    {
        studentId: "STU002",
        name: "Lucia Gomez",
        email: "lucia.gomez@example.com",
        age: 22,
        gender: "Female",
        course: "Frontend Development",
        gpa: 9.1,
        skills: ["HTML", "CSS", "JavaScript", "Angular"],
        enrollmentDate: ISODate("2024-04-10T00:00:00Z"),
        status: "active",
        address: {
            street: "45 San Martín Avenue",
            city: "Rosario",
            country: "Argentina"
        },
        phone: "+54 9 341 444-2222"
    },
    {
        studentId: "STU003",
        name: "Carlos Perez",
        email: "carlos.perez@example.com",
        age: 27,
        gender: "Male",
        course: "Data Science",
        gpa: 8.3,
        skills: ["Python", "Pandas", "Machine Learning", "SQL"],
        enrollmentDate: ISODate("2023-11-05T00:00:00Z"),
        status: "inactive",
        address: {
            street: "78 Rivadavia Blvd",
            city: "Córdoba",
            country: "Argentina"
        },
        phone: "+54 9 351 333-7777"
    },
    {
        studentId: "STU004",
        name: "Mariana Torres",
        email: "mariana.torres@example.com",
        age: 23,
        gender: "Female",
        course: "Mobile Development",
        gpa: 9.0,
        skills: ["Kotlin", "Java", "Flutter", "UI/UX"],
        enrollmentDate: ISODate("2024-01-20T00:00:00Z"),
        status: "active",
        address: {
            street: "9 de Julio 456",
            city: "Mendoza",
            country: "Argentina"
        },
        phone: "+54 9 261 222-8888"
    },
    {
        studentId: "STU005",
        name: "Diego Ramirez",
        email: "diego.ramirez@example.com",
        age: 29,
        gender: "Male",
        course: "Cybersecurity",
        gpa: 8.9,
        skills: ["Networking", "Linux", "Firewalls", "PenTesting"],
        enrollmentDate: ISODate("2024-05-12T00:00:00Z"),
        status: "active",
        address: {
            street: "Calle 12 #234",
            city: "La Plata",
            country: "Argentina"
        },
        phone: "+54 9 221 555-9999"
    }
]);
