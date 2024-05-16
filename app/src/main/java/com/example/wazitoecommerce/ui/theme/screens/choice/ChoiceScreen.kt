package com.example.wazitoecommerce.ui.theme.screens.choice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.EXPLORE_URL
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChoiceScreen(navController: NavController){

    Column  (
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background3),
                contentScale = ContentScale.FillBounds
            )
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Categories", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Transparent),
            navigationIcon = {
                IconButton(onClick = {navController.navigate(EXPLORE_URL) },) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White)

                }
            }
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column {

                Row(modifier = Modifier.padding(start = 20.dp)){
                    Image(painter = painterResource(id = R.drawable.ally),
                        contentDescription = "amazon",
                        modifier = Modifier.size(80.dp))

                    Column {
                        Text(text = "Choose your", fontSize = 20.sp, fontFamily = FontFamily.Serif)
                        Text(text = "Gadget category:", fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.width(60.dp))


                }
                //end of row
            }


        }
        Spacer(modifier = Modifier.height(30.dp))


        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "COMPUTER & ELECTRONICS", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "AUDIO/VISUAL", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "COMMUNICATION ", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))


        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "PHOTOGRAPHY AND VIDEO", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "HOME APPLIANCES", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "SECURITY & SURVEILLANCE", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "HEALTH AND FITNESS", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                navController.navigate(ADD_PRODUCTS_URL)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "TOYS AND GAMING", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))



    }

}
@Preview(showBackground = true)
@Composable
fun ChoiceScreenPreview(){
    ChoiceScreen(rememberNavController())
}
