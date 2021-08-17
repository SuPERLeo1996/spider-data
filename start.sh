#!/bin/bash

docker_server_addr="leo"
docker_project="spider-data:v1"
docker_name="spider-data"

docker stop $(docker ps | grep ${docker_server_addr}/${docker_project} | awk '{print $1}') &&
echo "容器已停止！！！！！！！！"
docker rm -f $(docker ps -a |  grep ${docker_server_addr}/${docker_project}  | awk '{print $1}') &&
echo "旧容器已删除！！！！！！！！"

file=`cd "\`dirname $0\`";pwd`

git pull

mvn clean

mvn -Dtest package

docker build  -t ${docker_server_addr}/${docker_project} .

docker run -d -p 10001:10001 --name ${docker_name} ${docker_server_addr}/${docker_project}




