#! /system/bin/sh

if [ -f /sdcard/backupX/feature.xml ];
then

cp /sdcard/backupX/feature.xml /system/csc
chmod 644 /system/csc/feature.xml

else 

cp /sdcard/backupX/others.xml /system/csc
chmod 644 /system/csc/others.xml

fi
