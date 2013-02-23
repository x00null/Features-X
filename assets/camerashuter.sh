#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Camera_ShutterSoundMenu>true</CscFeature_Camera_ShutterSoundMenu></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Camera_ShutterSoundMenu>true</CscFeature_Camera_ShutterSoundMenu></FeatureSet>" >> /system/csc/others.xml
fi
   
  
