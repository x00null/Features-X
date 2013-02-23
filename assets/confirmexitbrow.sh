#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Web_EnablePromptToExit>true</CscFeature_Web_EnablePromptToExit></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Web_EnablePromptToExit>true</CscFeature_Web_EnablePromptToExit></FeatureSet>" >> /system/csc/others.xml
fi
   
  
