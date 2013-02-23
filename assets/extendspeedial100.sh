#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Contact_ExtendSpeedDialTo100>true</CscFeature_Contact_ExtendSpeedDialTo100></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Contact_ExtendSpeedDialTo100>true</CscFeature_Contact_ExtendSpeedDialTo100></FeatureSet>" >> /system/csc/others.xml
fi
   
  
