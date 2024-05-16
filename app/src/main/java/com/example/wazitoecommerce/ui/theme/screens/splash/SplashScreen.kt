package com.example.wazitoecommerce.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.HOME_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.background5),
            contentScale = ContentScale.FillBounds
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(1000)
            navController.navigate(HOME_URL)
        }


        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.icon2),
                contentDescription = "splash",
                modifier = Modifier.size(250.dp))
        }






        Text(text = "AUCTION ALLY",
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
            ,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive,
            color = Color.Blue,
            fontWeight = FontWeight.ExtraBold)






    }


}
@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}



