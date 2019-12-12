README.MD

--To run the spring boot project from command line
mvn spring-boot:run

https://github.com/carnellj/spmia-chapter2.git
https://12factor.net/

Other mechanisms and protocols are more efficient than JSON for communicating
between services. The Apache Thrift (http://thrift.apache.org) framework allows you
to build multi-language services that can communicate with one another using a
binary protocol. The Apache Avro protocol (http://avro.apache.org) is a data serialization
protocol that converts data back and forth to a binary format between client and
server calls.


# 
http://localhost:8080/v1/organizations/e254f8c-c442-4ebe-a82a-e2fc1d1ff78a/licenses/f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a

http://localhost:8888/licensingservice/default

# 
pass below parameters from command line when starting license service / RESt API
Spring profile = dev
Spring cloud config endpoint = http://localhost:8888/licensingservice/dev

java -Dspring.cloud.config.uri=http://localhost:8888 \
-Dspring.profiles.active=dev \
-jar target/licensing-service-0.0.1-SNAPSHOT.jar
