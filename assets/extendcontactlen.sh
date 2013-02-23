#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Contact_LimitNameLength>1280</CscFeature_Contact_LimitNameLength></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Contact_LimitNameLength>1280</CscFeature_Contact_LimitNameLength></FeatureSet>" >> /system/csc/others.xml
fi
   
  
