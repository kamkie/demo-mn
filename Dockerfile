FROM oracle/graalvm-ce:1.0.0-rc15 as graalvm
COPY . /home/app/demo-mn
WORKDIR /home/app/demo-mn
RUN native-image --no-server -cp build/libs/demo-mn-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/demo-mn .
ENTRYPOINT ["./complete"]
