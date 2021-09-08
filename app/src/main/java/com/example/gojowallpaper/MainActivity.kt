package com.example.gojowallpaper
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val description = "Gojo Satarou is here"
            val scrollState = rememberScrollState()
            Row(
                modifier = Modifier.verticalScroll(scrollState)
            ) {
                Column( modifier = Modifier.fillMaxWidth(0.5f)) {
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__1_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__2_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__3_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__4_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__5_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__6_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__7_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__8_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__9_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__10_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__11_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__12_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__13_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__14_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__15_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__16_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__17_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__18_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__19_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__20_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__21_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__22_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__23_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__24_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__25_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__26_), contentDescription = description)
                }
                Column {
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__27_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__28_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__29_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__30_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__31_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__32_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__33_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__34_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__35_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__36_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__37_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__38_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__39_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__40_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__41_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__42_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__43_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__44_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__45_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__46_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__47_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__48_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__49_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__50_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__51_), contentDescription = description)
                    Wallpaper(painter = painterResource(id = R.drawable.gojo__52_), contentDescription = description)
                }
            }

        }
    }
}

@Composable
fun Wallpaper(
    painter:Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
){

    Card(
        modifier = modifier.padding(5.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box{
            Image(painter = painter, contentDescription = contentDescription,contentScale = ContentScale.Crop)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Default(){
    val dpainter = painterResource(id = R.drawable.gojo__8_)
    val description = "Gojo Satarou is here"
    Wallpaper(painter = dpainter, contentDescription = description)
}