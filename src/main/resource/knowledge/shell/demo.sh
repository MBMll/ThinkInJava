#!/bin/bash

# @Author: HP
# @Date:   2018-06-15 22:08:05
# @Last Modified by:   HP
# @Last Modified time: 2018-06-15 22:37:31

echo 'start a new work'

chmod +x ./test.sh #使脚本具有执行权限

./test.sh

/bin/sh test.sh

/bin/php test.php

your_name="runoob.com"

for file in `ls /etc`; do
  #statements
  echo file
done

your_name="qinjx"
echo $your_name
echo ${your_name}

for skill in Ada Coffe Action Java; do
  echo  "I am good at ${skill}Script"
done

myUrl="http://www.w3school.cc"
readonly myUrl
myUrl="http://www.runoob.com"

unset variable_name

unset myUrl
echo  $myUrl

your_name='qinjx'
str="Hello, I know you are \"$your_name\"! \n"

greeting="hello, "$your_name" !"
greeting_1="hello, ${your_name} !"
echo $greeting $greeting_1

string="abcd"
echo ${#string} # 4

string="runoob is a great site"
echo ${string:1:4} #unoo

string="runoob is a great company"
echo `expr index "$string" is` #8

array_name=(value0 value1 value2 value3)
array_name=(
  value0
  value1
  value2
  value3
  value4
)
array_name[0]=value0
array_name[1]=value1
array_name[n]=valuen

valuen=${array_name[n]}

echo ${array_name[@]}
# 取得数组长度
length=${#array_name[@]}
length=${#array_name[*]}
# 取得单个元素长度
lengthn=${#array_name[n]}

echo "Shell 传递参数实例"
echo "执行文件名: $0"
echo "第一个参数: $1"
echo "第二个参数: $2"
echo "第三个参数: $3"
