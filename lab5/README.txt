LAB 5 - Tenant Management (View Binding + Data Binding)

main_practical/    -> the app exactly as it should be at Step 21
try_it_yourself/   -> the same app plus the 4 "Try it yourself" exercises

Where each file goes in Android Studio:
  activity_main.xml -> app/res/layout/
  MainActivity.kt   -> app/kotlin+java/<your package>/
  Tenant.kt         -> app/kotlin+java/<your package>/
  build.gradle.kts.snippet.txt -> copy the marked lines into build.gradle.kts (Module :app)

If your package name is not com.example.tenantmanagementsystemgroupa, change it in:
  - the package line of MainActivity.kt and Tenant.kt
  - the import of ActivityMainBinding in MainActivity.kt
  - the <variable type="..."> in activity_main.xml

After pasting: Sync Now, then Build > Rebuild Project.
