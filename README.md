# Gorontalowords.com
Aplikasi Android - Game Susun Kata Bahasa Gorontalo

Demo apk Gorontalo Words dapat di unduh di link bawah ini :
https://github.com/idbmb/Gorontalowords.com/blob/master/app/build/outputs/apk/app-debug.apk

Ini adalah proyek template untuk Android Studio yang memungkinkan Anda untuk membuat aplikasi tampilan web android dengan mudah. Anda dapat menggunakannya untuk membuat aplikasi sederhana untuk website atau sebagai titik awal untuk aplikasi berbasis HTML5 android Anda.

### Getting started

1. [Install Android Studio](http://developer.android.com/sdk/index.html), Pastikan bahwa [Android SDK Tools](http://developer.android.com/sdk/index.html#Other) terpasang dan menginstal [appropriate packages](http://developer.android.com/sdk/installing/adding-packages.html) untuk platform yang ingin Anda targetkan.

2. [Download](https://github.com/idbmb/Gorontalowords.com/archive/master.zip) atau mengkloning repositori ini dan mengimpornya ke Android Studio.

### Using a remote source

Jika Anda ingin membuat sebuah aplikasi yang menampilkan isi dari situs

1. uncomment **line 37** di `MainActivity.java` and change `http://gorontalowords.com` to match your remote source

	```
	mWebView.loadUrl("http://gorontalowords.com");
	```

2. open the `MyAppWebViewClient.java` file and replace `gorontalowords.com` in **line 12** with your custom url

	```
	if (Uri.parse(url).getHost().endsWith("gorontalowords.com")) {
	```

### Using a local source

Jika Anda ingin membuat HTML5 aplikasi android lokal

1. uncomment **line 53** in `MainActivity.java`

	```
	mWebView.loadUrl("file:///android_asset/www/index.html");
	```

2. replace the boilerplate website in `src/main/assets/www/` with your own HTML, CSS and JavaScript files

# Screenshots

<img src="https://github.com/idbmb/Gorontalowords.com/blob/master/Screenshot/15182573_1809864675896071_685297613_o.png?raw=true" width="300" height="450" />
<img src="https://github.com/idbmb/Gorontalowords.com/blob/master/Screenshot/15182517_1809864639229408_1149362133_o.png?raw=true" width="300" height="450" />
<img src="https://github.com/idbmb/Gorontalowords.com/blob/master/Screenshot/15204055_1809864609229411_978301298_o.png?raw=true" width="300" height="450" />
<img src="https://github.com/idbmb/Gorontalowords.com/blob/master/Screenshot/15146711_1809864612562744_1025506103_o.png?raw=true" width="300" height="450" />
<img src="https://github.com/idbmb/Gorontalowords.com/blob/master/Screenshot/15215703_1809864649229407_278132949_o.png?raw=true" width="300" height="450" />
