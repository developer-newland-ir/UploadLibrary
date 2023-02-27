# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#-keep class com.thunder.mylibrary.StringUtilsManager { *; }
-keep public class com.thunder.mylibrary.StringUtilsManager { public *; }
-keepclasseswithmembernames class com.thunder.mylibrary.StringUtilsManager { public *; }
-keepclassmembernames class com.thunder.mylibrary.StringUtilsManager {<methods>;}
-keep class com.thunder.mylibrary.StringUtilsManager {public <methods>;}
-keepclasseswithmembernames,includedescriptorclasses class com.thunder.mylibrary.StringUtilsManager {
    native <methods>;
}
#keeps the names of all public classes in the specified package:
-keep public class com.myapp.customcomponents.*

# keeps the names of all public classes in the specified package and its subpackages:
-keep public class com.myapp.customcomponents.**

#keeps the names of all public/protected classes/fields/methods in the specified package and its subpackages:
-keep public class com.myapp.customcomponents.** {
  public protected *;
}

#-keepclasseswithmembernames class com.thunder.mylibrary.StringUtilsMosi { *; }
#-keepclassmembernames class com.thunder.mylibrary.* {<methods>;}

#https://stackoverflow.com/questions/49383069/proguard-keep-only-class-name-and-all-members-and-methods-inside-the-class
#https://jebware.com/blog/?p=418

#-keepclasseswithmembernames class com.thunder.mylibrary.StringUtilsMosi {
#    native <methods>;
#}
