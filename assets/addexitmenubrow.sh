#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Web_AddOptionToTerminate>true</CscFeature_Web_AddOptionToTerminate></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Web_AddOptionToTerminate>true</CscFeature_Web_AddOptionToTerminate></FeatureSet>" >> /system/csc/others.xml
fi
   
  
