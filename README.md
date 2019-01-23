# Interviews

Typical interview questions in this project.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

1. JDK8
2. Maven3

### Installing
1. git clone https://github.com/damonx/interviews.git
2. cd kiwiplan-interview/
3. mvn clean install

## Run & test
In kiwiplan-interview/ directory.
Approach 1, issue the following command in your terminal. You'll see the result.

```
mvn -U clean install
```

Approach 2, via executable jar file.

```
mvn -U clean package && cd ./target && java -jar kiwiplan-interview-1.0-SNAPSHOT.jar
```

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Damon Xu** - *Initial work* - [DAMONX](https://github.com/damonx)
