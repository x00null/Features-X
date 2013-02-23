#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Message_EnableScheduledMessage>true</CscFeature_Message_EnableScheduledMessage>
<CscFeature_Message_EnableScheduledMsgBox>true</CscFeature_Message_EnableScheduledMsgBox></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Message_EnableScheduledMessage>true</CscFeature_Message_EnableScheduledMessage>
<CscFeature_Message_EnableScheduledMsgBox>true</CscFeature_Message_EnableScheduledMsgBox></FeatureSet>" >> /system/csc/others.xml
fi
   
  
