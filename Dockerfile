FROM oracle/graalvm-ce:19.1.1 as graalvm
RUN gu install native-image
WORKDIR /home/app/demo-mn
COPY build/libs /home/app/demo-mn
RUN native-image --no-server -cp demo-mn-*-all.jar && ls -lh

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/demo-mn/demo.mn .
ENTRYPOINT ["./demo.mn"]
