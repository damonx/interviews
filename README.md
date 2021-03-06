# Interviews

Typical interview questions in this project.

## Getting Started

Please refer to prereqisites to download relevant tools.

### Prerequisites

1. JDK8
2. Maven3

### Installing
```
git clone https://github.com/damonx/interviews.git &&
cd company-interview/ &&
mvn clean install
```
## Run & test
In company-interview/ directory.

1. Approach 1, issue the following command in your terminal. You'll see the result.

```
mvn -U clean install
```

2. Approach 2, via executable jar file.

```
mvn -U clean package && cd ./target && java -jar kiwiplan-interview-1.0-SNAPSHOT.jar
```
3. Approach 3, import the project as a existing maven project into Eclipse, and run the main class ```OrganisationClient```
## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Damon Xu** - *Initial work* - [DAMONX](https://github.com/damonx)
