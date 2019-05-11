FROM oracle/graalvm-ce:1.0.0-rc15 as graalvm
COPY build/libs /home/app/demo-mn
WORKDIR /home/app/demo-mn
RUN native-image --no-server -cp demo-mn-*-all.jar && ls -lh

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/demo-mn/demo.mn .
ENTRYPOINT ["./demo.mn"]
