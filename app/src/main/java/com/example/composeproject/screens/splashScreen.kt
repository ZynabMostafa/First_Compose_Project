package com.example.composeproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeproject.R



@Composable
fun Screen (){
   imagSplashScreen()
   }



@Composable
fun imagSplashScreen() {
    
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        , verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.size(200.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_outline_local_phone),
            contentDescription = "spash icon",
            modifier = Modifier
                .size(80.dp)
                .shadow(elevation = 15.dp, clip = true, shape = CircleShape)
                .background(color = Color.White, shape = CircleShape)
                .padding(5.dp)
                .background(color = Color.Green, shape = CircleShape)
        )
    Spacer(modifier = Modifier.size(400.dp))
        Text(text = "from " ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            , fontSize = 20.sp
            , textAlign= TextAlign.Center

        )
      
        Text(text = "Meta",
            modifier = Modifier.fillMaxWidth()
            , fontSize = 30.sp
            , fontWeight = FontWeight.W700 
            , color = Color.Green
            , textAlign= TextAlign.Center
        )
        
    }
    }





@Preview
@Composable
fun previewImageSplashScreen() {
  Screen()
}