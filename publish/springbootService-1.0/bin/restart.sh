#!/bin/bash
PRG="$0"
BIN=`cd $(dirname "$PRG"); pwd`
HOME=`dirname "$BIN"`
LIB=`find ${HOME}/lib/ -name "*.jar"`
LOG=${HOME}/logs/
classpath="."
for item in ${LIB}
do
  classpath=${classpath}:${item}
done
JVM_OPTS="-server -Xms512M -Xmx512M -Xloggc:${LOG}/gc.log -XX:-PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCApplicationStoppedTime -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=70 -XX:+CMSParallelRemarkEnabled -XX:+HeapDumpOnOutOfMemoryError"
for i in `ps aux | grep ${HOME} | grep -v 'grep' | awk '{print$2}'`
do
  echo "kill "${i}
  kill ${i}
done
echo "sleep 3s"
sleep 3
cd ${HOME}
java ${JVM_OPTS} -cp ${classpath} org.after90.Application > /dev/null 2>&1 &
echo "dataService start success."
