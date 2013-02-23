#! /system/bin/sh

if [ -f /system/csc/feature.xml ];
then
   echo "<FeatureSet><CscFeature_Sip_UseSymbolInCMKey>true</CscFeature_Sip_UseSymbolInCMKey>
<CscFeature_Sip_EnableSymbolInSecondary>de;en_GB;en_US;en_AU;en_CA;en_PH;en_IE;en_NZ;en_ZA;
ko_KR;de_AT;de_CH;de_DE;fr_FR;fr_CH;fr_BE;fr_CA; bg_BG;cs_CZ;da_DK;el_GR;es_ES;et_EE;fi_FI;
ga_IE;hr_HR;hu_HU;is_IS;it_IT; lt_LT;lv_LV;mk_MK;ms_MY;nb_NO;nl_NL;nl_BE;pl_PL;pt_PT;pt-BR;ro_RO;sr_RS;sv_SE;tr_TR; ca_ES;eu_ES;gl_ES;kk_KZ;ru_RU;sk_SK;sl_SI;uk_UA;uz_UZ;az_AZ;hy_AM;ka_GE;
pt_BR;in_ID;ja_JP;vi_VN;zh_CN;zh_TW;ar_AE;ar_IL;fa_FA;ur_PK;iw_IL;th_TH;zh_HK;zh_SG</CscFeature_Sip_EnableSymbolInSecondary></FeatureSet>" >> /system/csc/feature.xml
   
else
   echo "<FeatureSet><CscFeature_Sip_UseSymbolInCMKey>true</CscFeature_Sip_UseSymbolInCMKey>
<CscFeature_Sip_EnableSymbolInSecondary>es_US;en_GB;en_US;en_AU;en_CA;en_PH;en_IE;en_NZ;en_ZA;
ko_KR;de_AT;de_CH;de_DE;fr_FR;fr_CH;fr_BE;fr_CA; bg_BG;cs_CZ;da_DK;el_GR;es_ES;et_EE;fi_FI;
ga_IE;hr_HR;hu_HU;is_IS;it_IT; lt_LT;lv_LV;mk_MK;ms_MY;nb_NO;nl_NL;nl_BE;pl_PL;pt_PT;pt-BR;ro_RO;sr_RS;sv_SE;tr_TR; ca_ES;eu_ES;gl_ES;kk_KZ;ru_RU;sk_SK;sl_SI;uk_UA;uz_UZ;az_AZ;hy_AM;ka_GE;
pt_BR;in_ID;ja_JP;vi_VN;zh_CN;zh_TW;ar_AE;ar_IL;fa_FA;ur_PK;iw_IL;th_TH;zh_HK;zh_SG</CscFeature_Sip_EnableSymbolInSecondary></FeatureSet>" >> /system/csc/others.xml
fi
   
  
