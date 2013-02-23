#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Launcher_DisablePageRotation>false</CscFeature_Launcher_DisablePageRotation></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Launcher_DisablePageRotation>false</CscFeature_Launcher_DisablePageRotation></FeatureSet>" >> /system/csc/others.xml
fi
   
  
