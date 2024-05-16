package com.example.wazitoecommerce.ui.theme.screens.explore


import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
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
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.CHOICE_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.ui.theme.screens.home.bottomNavItems
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()){


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


            floatingActionButton = {
                FloatingActionButton(onClick = {navController.navigate(CHOICE_URL)}) {
                    IconButton(onClick = {navController.navigate(CHOICE_URL)}) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{

                Spacer(modifier = Modifier.height(100.dp))

                Column (modifier = Modifier.verticalScroll(rememberScrollState())){
                    var search by remember { mutableStateOf("") }



                    Spacer(modifier = Modifier.height(10.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentAlignment = Alignment.BottomEnd){
                        val mContext = LocalContext.current
                        Image(
                            painter = painterResource(id = R.drawable.gadgets) ,
                            contentDescription = "gadgets",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(LOGIN_URL)
                                    Toast
                                        .makeText(
                                            mContext, "Clicked on an image!",
                                            Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                            contentScale = ContentScale.Crop
                        )
                        Column {
                            Text(
                                text = "AUCTION GADGETS",
                                fontSize = 30.sp,
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "Bid your gadgets here",
                                fontSize = 20.sp,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                        }

                    }
                    //End of Box

                    Text(
                        text = "Available gadgets for bidding:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 30.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //ROw1

                    Row(
                        modifier = Modifier
                            .horizontalScroll(rememberScrollState())
                            .padding(start = 30.dp)
                    ){
                        //CARD1
                        Card(
                            modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(VIEW_PRODUCTS_URL)

                                Toast.makeText(mContext,"Go to clothing screen!",
                                    Toast.LENGTH_SHORT).show()
                            }
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.mobilephones),
                                        contentDescription = "vehicles",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "COMPUTER & ELECTRONICS",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.tablets),
                                        contentDescription = "houses",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "COMMUNICATION DEVICES",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.jewellery),
                                        contentDescription = "hphones",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "PHOTOGRAPHY",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.clothing),
                                        contentDescription = "clothing",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "HOME APPLIANCES",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.gadgets),
                                        contentDescription = "gadgets",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "SECURITY & SURVEILLANCE",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                    }//end of row1

                    Spacer(modifier = Modifier.height(10.dp))

                    //ROw1

                    Row(
                        modifier = Modifier
                            .horizontalScroll(rememberScrollState())
                            .padding(start = 30.dp)
                    ){
                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.vehicle),
                                        contentDescription = "vehicles",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "HEALTH AND FITNESS",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.house2),
                                        contentDescription = "houses",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "TOYS AND GAMING",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.jewellery),
                                        contentDescription = "JEWELLERY",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "JEWELLERY",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.clothing),
                                        contentDescription = "clothing",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "CLOTHING",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                        //CARD1
                        Card(modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                        )
                        {
                            Column {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.gadgets),
                                        contentDescription = "gadgets",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop)

                                }
                                Text(
                                    text = "GADGETS",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp)
                            }

                        }
                        //END OF CARD
                        Spacer(modifier = Modifier.width(8.dp))

                    }//end of row1

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
    com.example.wazitoecommerce.ui.theme.screens.home.BottomNavItem(
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
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)

@Preview(showBackground = true)
@Composable
fun ExploreScreenPreview(){
    ExploreScreen(rememberNavController())
}

