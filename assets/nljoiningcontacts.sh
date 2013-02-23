#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Contact_SetLinkCountMaxAs>999</CscFeature_Contact_SetLinkCountMaxAs></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Contact_SetLinkCountMaxAs>999</CscFeature_Contact_SetLinkCountMaxAs></FeatureSet>" >> /system/csc/others.xml
fi
   
  
