

## Task & Correponding Notes:
1) Create a Producing and Consuming service
2) Provide a Test Plan that describes an approach on how to test this system: types, levels of testing, tech stack, tooling.

Notes:
1) I have managed to create basic Kafka Producer-Consumer set-up using Spring-boot

## How to Run:
Option 1:
-	To Start : execute launchTestEnv.sh script located in test-env folder
-	To shot-down: execute stopAndCleanUpTestEnv.sh script located in test-env folder
-  Run SpringBootKafkaProducerApplication from IDE

Option 2:
-  Start your local Docker (Docker desktop/Kitematics etc.)
-  From this project's root execute -> `docker-compose up`
-  Run SpringBootKafkaProducerApplication from IDE
   
<img width="1021" alt="Screenshot 2021-05-03 at 01 28 05" src="https://user-images.githubusercontent.com/7977484/116832969-d28c4780-abae-11eb-80de-e98ce5cdb312.png">

Now, you can test firing POST request to end-point using:

```http://localhost:8080/publish?message=HelloTest1200```


## Testing Strategy:
1. I would add unit tests for Individual classes like - Consumer, Producer, Controller
2. To test whole Publisher-subscriber set-up, I would test using Consumer-Driven Contract Testing framework like PACT
   2.1 I have created a small PoC to test Restful HTTP endpoints using PACT Consumer Driven Contract testing framework
   [simple pact poc to test Producer - Consumer contracts](https://github.com/laxmikantm/skeleton-pact-contract-testing-framework)
   ``https://github.com/laxmikantm/skeleton-pact-contract-testing-framework``
3. I will try to use wiremock to stub responses if we've to test certain part of modules in isolation.

Thanks
