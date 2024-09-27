package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace_Main()
                }
            }
        }
    }
}

@Composable
fun Arttitle_fun(ArtPicture : Int, ArtTitle : String, ArtistName : String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = ArtPicture),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .height(300.dp)
                .width(300.dp)
                .border(border = BorderStroke(2.dp, Color.Black), shape = RectangleShape)
                .shadow(elevation = 4.dp)
                .padding(10.dp)
        )
        Card(
            modifier = Modifier
                .padding(horizontal = 35.dp, vertical = 80.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = ArtTitle,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    lineHeight = 30.sp
                )
                Text(
                    text = ArtistName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


@Composable
fun ArtSpace_Main(){
    var result by remember {
        mutableStateOf(0)
    }
    val totalItems = 5

    when(result){
        1 -> Arttitle_fun(
            ArtPicture = R.drawable.edvardmunch,
            ArtTitle = stringResource(R.string.TEdvardMunch),
            ArtistName = stringResource(id = R.string.EdvardMunch)
        )
        2 -> Arttitle_fun(
            ArtPicture = R.drawable.johannes,
            ArtTitle = stringResource(R.string.TJohannes),
            ArtistName = stringResource(id = R.string.JohannesVermeer)
        )
        3 -> Arttitle_fun(
            ArtPicture = R.drawable.georges,
            ArtTitle = stringResource(R.string.TGeorgesSeurat),
            ArtistName = stringResource(id = R.string.George)
        )
        4 -> Arttitle_fun(
            ArtPicture = R.drawable.selfportrait,
            ArtTitle = stringResource(R.string.TSelfPortrait),
            ArtistName = stringResource(id = R.string.SelfPortrait)
        )
        5 -> Arttitle_fun(
            ArtPicture = R.drawable.eugenedelacroix,
            ArtTitle = stringResource(R.string.TEugeneDelacroix),
            ArtistName = stringResource(id = R.string.EugeneDelacroix)
        )
        else -> Arttitle_fun(
            ArtPicture = R.drawable.jean_antoine,
            ArtTitle = stringResource(R.string.TJeanAntoine),
            ArtistName = stringResource(id = R.string.JeanAntoine)
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 850.dp)
    ) {
        Button(
            onClick = { result = if (result == 0) totalItems else result - 1 },
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, Color.Gray),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            )
        ) {
            Text(text = "Atras")
        }
        Button(
            onClick = { result = if (result == totalItems) 0 else result + 1 },
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, Color.Gray),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            )
        ) {
            Text(text = "Siguiente")
        }

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpace_Main()
    }
}