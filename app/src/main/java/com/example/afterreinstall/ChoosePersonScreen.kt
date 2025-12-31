package com.example.afterreinstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.afterreinstall.ui.theme.FernGreen
import com.example.afterreinstall.ui.theme.PakistanGreen
import com.example.afterreinstall.ui.theme.ResedaGreen

@Composable
fun ChoosePersonScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier.padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .background(ResedaGreen,
                        shape = RoundedCornerShape(24.dp),
                    ),
            ) {
                Column (
                    modifier = Modifier.padding(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("Selection of the tester: ",
                        style = TextStyle(
                            fontSize = 25.sp,
                        ),
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(Screen.TestDetail.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = FernGreen,
                            contentColor = Color.Black
                        )
                    ) {
                        Text("Chose from saved people",
                            style = TextStyle(
                                fontSize = 20.sp,
                            ),
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(Screen.TestDetail.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = FernGreen,
                            contentColor = Color.Black
                        )
                    ) {
                        Text("Add new person",
                            style = TextStyle(
                                fontSize = 20.sp,
                            ),
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    Button(
                        onClick = { navController.navigate(Screen.TestDetail.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = FernGreen,
                            contentColor = Color.Black
                        )
                    ) {
                        Text("Don't save",
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
}

@Preview(showBackground = true)
@Composable
fun ChoosePersonScreenPre() {
    val navController = rememberNavController()
    ChoosePersonScreen(navController)
}