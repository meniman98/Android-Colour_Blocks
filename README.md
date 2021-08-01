# Android-Colour_Blocks
Use of constraint layout, data binding, switch statement for multiple views, chaining of views

# Hello and Welcome
Download this app to colour some blocks by tapping the screen

## Point of the app
The point is to demonstrate how constraint layouts work. This layout may look simple, but it's very responsive
meaning it can resize to other phone screens. It is fairly complex how the layout is built together, but thanks to Android's
constraint layout, it is easier to achieve such a robust design. If this were a web page, it'd be significantly harder.
Thanks to Android, there's a GUI that you can work with, by clicking and dragging. Though this may sound easy, a lot of 
intelligence is required to make the desired layout, so it's certainly not as easy as making clicks and dragging things

Data binding is indeed used. I didn't have to use it, but I did, just for the sake of practise. And using it makes things far easier. 
Let me explain the traditional approach of attaching views to their variables in its activity

### Steps

1. initialise the Textview variable globally. In Kotlin, use ```private lateinit var myTextview: TextView``` in Java I believe you'd use ```private TextView myTextview;``` 
remember to do this globally, not within onCreate()
2. Assign the value of ```myTextview``` inside onCreate or whatever function you are using by doing this ```myTextview = findViewById(R.id.tvHelloWorld)```
should work the same in Kotlin and Java. Remember, it is very important where you are assigning the variable ```myTextview``` because this variable may not be available 
globally due to scope. This makes using the variable a bit of a pain elsewhere, but typically you'd use it within onCreate, but sometimes within other functions
3. Finally use the variable so do something like ```myTextview.setText("Hello there")``` now you've finally used the textview to do something you want. However allow me to explain
how easy this is with data binding

### Data binding steps
Make sure to enable data binding first inside build.gradle 
```    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    buildFeatures {
        dataBinding true
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
 ```

1. Globally initialise the binding variable by doing ```private lateinit var binding: FragmentWelcomeFragment``` with Java it might be something like ```private FragmentWelcome binding;```
2. Within onCreate, give binding a value by doing ```binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)``` should be the same for Java. 
3. Now whenever you want to use a textview, button or any other view, you simply use ```binding.myButton```. So for example you could do
```binding.myButton.setOnClickListener() {}``` to set a click listener, simple as that. No need for finding the IDs of everything single view. This is faster in development
and also performance. It's a win-win for sure. There's absolutely no excuse not to use this

For sure data binding is far easier and nicer to use after analysing the two steps
