package com.example.wazitoecommerce.ui.theme.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.lBlue
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.CHOICE_URL

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background5),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                ){
                    Column {
                        Spacer(modifier = Modifier.height(30.dp))

                        Row(modifier = Modifier.padding(start = 20.dp)){
                            Image(painter = painterResource(id = R.drawable.ally),
                                contentDescription = "bid",
                                modifier = Modifier.size(80.dp))
                            Spacer(modifier = Modifier.width(50.dp))
                            Column {
                                Text(text = "AuctionAlly", fontSize = 30.sp, color = lBlue, fontFamily = FontFamily.Serif)
                                Text(text = "Welcome to Ally", fontSize = 20.sp)
                            }
                            Spacer(modifier = Modifier.width(60.dp))


                        }
                        //end of row
                    }
                    //Row1
                    Row {
                        //card 1
                        val mContext = LocalContext.current
                        Card(
                            modifier = Modifier
                                .size(width = 180.dp, height = 150.dp)
                                .padding(20.dp)
                                .clickable {
                                    navController.navigate(CHOICE_URL)
                                    Toast.makeText(mContext,"Go to clothing screen!",
                                        Toast.LENGTH_SHORT).show()
                                }

                        ){
                            Row {
                                Text(text = "BID",
                                fontSize = 40.sp,
                                textAlign = TextAlign.Right,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Black
                            )
                                Box(modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.bid3),
                                        contentDescription = "clothing",
                                        modifier = Modifier.size(80.dp))
                                }

                            }

                        }
                        // end of card 1
                        Spacer(modifier = Modifier.width(5.dp))
                        //card 2
                        Card(
                            modifier = Modifier
                                .size(width = 180.dp, height = 150.dp)
                                .padding(20.dp)
                                .clickable {
                                    navController.navigate(CHOICE_URL)
                                    Toast.makeText(mContext,"Go to clothing screen!",
                                        Toast.LENGTH_SHORT).show()
                                }

                        ){
                            Row {
                                Text(text = "BUY",
                                    fontSize = 40.sp,
                                    textAlign = TextAlign.Right,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                                Box(modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center){
                                    Image(painter = painterResource(id = R.drawable.bid3),
                                        contentDescription = "clothing",
                                        modifier = Modifier.size(80.dp))
                                }

                            }

                        }
                        // end of card 2
                    }
                    //end of Row1

                    //card 3
                    val mContext = LocalContext.current
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(20.dp)
                            .clickable {
                                navController.navigate(CHOICE_URL)
                                Toast.makeText(mContext,"Go to clothing screen!",
                                    Toast.LENGTH_SHORT).show()
                            }

                    ){
                        Row {
                            Text(text = "AUCTION",
                                fontSize = 40.sp,
                                textAlign = TextAlign.Right,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Black
                            )
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.bid3),
                                    contentDescription = "clothing",
                                    modifier = Modifier.size(80.dp))
                            }

                        }

                    }
                    // end of card 3



                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),
    BottomNavItem(
        title = "Explore",
        route = "explore",
        selectedIcon = Icons.Filled.Search,
        unselectedIcon = Icons.Outlined.Search,
        hasNews = false,
        badges = 0
    ),



    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Signup",
        route="signup",
        selectedIcon=Icons.Filled.Face,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}