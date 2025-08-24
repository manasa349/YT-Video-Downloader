# 🎥 YouTube Video Downloader (Java + yt-dlp)

A simple YouTube video downloader built in Java that uses [`yt-dlp`](https://github.com/yt-dlp/yt-dlp) under the hood to fetch and save videos directly from YouTube.

> 📌 Built using only Java — no GUI, perfect for terminal use.

---

## 📁 Project Structure

YoutubeVideoDownloader/
├── YouTubeDownloader.java # Main Java source file
└── downloads/ # Folder where videos will be saved
---
## 🚀 Features

- ✅ Download YouTube videos from the terminal
- ✅ Saves videos with the original title
- ✅ Works on Windows (can be adapted for Mac/Linux)
- ✅ Clean and minimal code

---

## 🛠 Requirements

| Tool       | Description                        |
|------------|------------------------------------|
| Java       | JDK 17 or higher                   |
| Python     | Required for installing `yt-dlp`   |
| yt-dlp     | The actual video downloader        |

---

## 📦 Installation & Setup

### 1. Clone the Repository

git clone https://github.com/your-username/youtube-video-downloader-java.git
cd youtube-video-downloader-java
2. Install yt-dlp
pip install yt-dlp
Make sure yt-dlp.exe is located at:
C:\Users\<your-username>\AppData\Roaming\Python\Python3XX\Scripts\yt-dlp.exe

🧑‍💻 Usage
1. Compile the Java Code
javac YouTubeDownloader.java
2. Run the App
java YouTubeDownloader
3. Enter a YouTube URL
Paste any valid video link:
https://www.youtube.com/watch?v=VIDEO_ID
✅ Video will be saved in the downloads/ folder.

📝 Configuration
If you see a file-not-found error, update this line in your Java file:
String ytDlpPath = "C:\\Users\\misba\\AppData\\Roaming\\Python\\Python313\\Scripts\\yt-dlp.exe";
Make sure the path is valid on your system.

🛡️ Legal Note
This tool is intended for educational purposes only.
Make sure you comply with YouTube's Terms of Service before downloading any videos.

📌 Future Improvements
 Add GUI with JavaFX or Swing

 Format selector (360p/720p/1080p)

 Audio-only download mode (MP3)

 Build .jar file for easy execution

🙌 Contributing
Pull requests are welcome!
Feel free to fork the project and improve it.

📄 License
MIT License © 2025 ManasaYaseen

---

Let me know if you'd like me to:

- Add **screenshots or demo GIFs**  
- Help write a `.jar` packaging guide  
- Add a GUI version section to the README  
- Generate `LICENSE` or `.gitignore` files for GitHub

Ready to help you polish the repo!
