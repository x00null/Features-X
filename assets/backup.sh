#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
mkdir /sdcard/backupX
cp /system/csc/feature.xml /sdcard/backupX

else
mkdir /sdcard/backupX
cp /system/csc/others.xml /sdcard/backupX

fi
