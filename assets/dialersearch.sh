#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Dialer_PhonebookNdigitsMatching>true</CscFeature_Dialer_PhonebookNdigitsMatching>
<CscFeature_RIL_CallerIdMatchingDigit>true</CscFeature_RIL_CallerIdMatchingDigit></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Dialer_PhonebookNdigitsMatching>true</CscFeature_Dialer_PhonebookNdigitsMatching>
<CscFeature_RIL_CallerIdMatchingDigit>true</CscFeature_RIL_CallerIdMatchingDigit></FeatureSet>" >> /system/csc/others.xml
fi
   
  
