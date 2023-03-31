# School Project Using Clean Architecture
This is a Java project that follows the Clean Architecture principles. The project aims to provide a sample implementation of Clean Architecture using Java.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
To run this project, you will need:

* Java Development Kit (JDK) 11
* Maven
* Git
* Installing
* Clone the repository

### Installing
1. Clone the repository

```bash
git clone https://github.com/rflsousa/school-clean-arc.git
```

2. Change directory to the project root

```bash
cd school-clean-arc
```
3. Build the project

```bash
mvn clean install
```

4. Run the project

```bash
java -jar target/school-clean-arc-1.0-SNAPSHOT.jar
```

### Project Structure
The project follows the Clean Architecture principles and is divided into the following packages:

- domain: This package contains the core business logic of the application. It includes entities, use cases, and interfaces for repositories and services.
- application: This package contains the application-specific logic. It includes use case implementations and interfaces for external services.
- infrastructure: This package contains the implementation details of the application. It includes database and web adapters, as well as external libraries and frameworks.

### Running the Tests
To run the tests, execute the following command:

```bash
mvn test
```

### Built With
* Java - Programming language
* Maven - Build tool
* JUnit - Testing framework
* Mockito - Mocking framework
