FROM ubuntu:latest
LABEL authors="mesta"

ENTRYPOINT ["top", "-b"]