package co.edu.udea.compumovil.gr06_20242.videoplayer


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr06_20242.videoplayer.ui.theme.VideoPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoPlayerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val videoUrl =
                        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
                    Column {
                        YouTubePlayer(
                            youtubeVideoId = "oe70Uhjc_F4",
                            lifecycleOwner = LocalLifecycleOwner.current
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        VideoPlayerExo(videoUrl =videoUrl)
                    }
                }
            }
        }
    }
}


