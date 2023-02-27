#-keep public class com.thunder.mylibrary.StringUtilsManager { public *; }
#-keepclasseswithmembernames class com.thunder.mylibrary.StringUtilsManager { public *; }
#-keepclassmembernames class com.thunder.mylibrary.StringUtilsManager {<methods>;}
-keep class com.thunder.mylibrary.StringUtilsManager {public <methods>;}
#-keepclasseswithmembernames,includedescriptorclasses class com.thunder.mylibrary.StringUtilsManager {
#    native <methods>;
#}