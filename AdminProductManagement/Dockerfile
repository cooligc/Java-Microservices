FROM maven

MAINTAINER sitakant

ENV MICROSERVICE_HOME /usr/local/microservices

ENV RUNNING_DIR /Java-Microservices/AdminProductManagement

RUN mkdir -p $MICROSERVICE_HOME

WORKDIR $MICROSERVICE_HOME

RUN apt-get install git 

RUN git clone https://github.com/cooligc/Java-Microservices.git

RUN echo $MICROSERVICE_HOME/$RUNNING_DIR

COPY repository ~/.m2

RUN cd $MICROSERVICE_HOME/$RUNNING_DIR && mvn clean install -X 

RUN cp -rf $MICROSERVICE_HOME/$RUNNING_DIR/target/AdminProductManagement-0.0.1-SNAPSHOT.jar $MICROSERVICE_HOME

EXPOSE 8080

ENTRYPOINT ["java","-jar","AdminProductManagement-0.0.1-SNAPSHOT.jar"]


