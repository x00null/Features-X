#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Message_ReplaceCRToNewLine>true</CscFeature_Message_ReplaceCRToNewLine></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Message_ReplaceCRToNewLine>true</CscFeature_Message_ReplaceCRToNewLine></FeatureSet>" >> /system/csc/others.xml
fi
   
  
