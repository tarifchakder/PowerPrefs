# PowerPrefs -  A Powerful Android SharedPreferences wrapper Library Written in Kotlin 🤩🔥

[![](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16#l16)

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/tarifchakder)

## Repository

## Usage

This is the basic usage, you can get values (specifying a default value or not) and save values like so:

```kotlin
// create an singleton instance
val pref = PowerPref.getInstance(this)

// get item 
pref.getString("key",null)

// save method save item all supported sharedPreferences
pref.save("key","your value")

```

But I highly  Recommend to use singleton class

create an object ```Settings.kt```

```kotlin
object Settings {

    private val pref = PowerPref.getInstance(ContextProvider.appContext)

    var helloPowerPref: String
        get() = pref.getString("key", "Hello PowerPref !!") ?: "Hello PowerPref !!"
        set(value) = pref.save("key", value)

    var time: String
        get() = pref.getString("time", "Today") ?: "Today"
        set(value) = pref.save("time", value)


}
```

now simply access anywhere 

```kotlin
class MainActivity : AppCompatActivity() {
    
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // get item from shared pref
        val item1 = Settings.helloPowerPref
        val item2 = Settings.time

        bind.txt.text = item2 + "  "+ item1

        bind.btn.setOnClickListener {
            // save item t
            Settings.time = "Next Day"
            Settings.helloPowerPref = "Successfully saved "
            
            bind.txt.text = Settings.time + "  "+ Settings.helloPowerPref

        }
        

    }
    
}
```

<p>
Don't forget to star ⭐ the repo it motivates me to share more open source
</p>


## Donation

If this project help you reduce time to develop, you can give me a cup of coffee :)

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/tarifchakder)

## License

```text
Copyright 2022 Md Tarif Chakder

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```


