package com.example.afterreinstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.afterreinstall.ui.theme.FernGreen
import com.example.afterreinstall.ui.theme.PakistanGreen
import com.example.afterreinstall.ui.theme.ResedaGreen

@Composable
fun TestScreen(navController: NavHostController, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier
                .padding(start = 25.dp, end = 25.dp, top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Test",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .weight(1f)
                )

                IconButton(
                    onClick = { onClick() }
                ) {
                    Icon(
                        imageVector = Icons.Default.DensityMedium,
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp),
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                TestButton(test, navController, onClick)

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                        .height(60.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = FernGreen,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Add a Test",
                        style = TextStyle(
                            fontSize = 20.sp,
                        ),
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun TestButton(test: List<String>, navController: NavHostController, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        for(t in test) {
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { navController.navigate(Screen.ChoosePerson.route) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ResedaGreen,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = t,
                        style = TextStyle(
                            fontSize = 22.sp
                        ),
                        color = Color.White
                    )

                    IconButton(
                        onClick = { onClick() }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp),
                            tint = Color.White
                        )
                    }
                }
            }
        }
    }
}

var test = listOf(
    "Test 9x4",
    "Shuttle Run Test",
    "Reaction time test",
    "Online data test",
    "Offline data test"
)

@Preview(showBackground = true)
@Composable
fun TestButtonPre() {
    val navController = rememberNavController()

    TestScreen(navController = navController, onClick = {})
}