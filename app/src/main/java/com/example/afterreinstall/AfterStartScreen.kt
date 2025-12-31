package com.example.afterreinstall

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import com.example.afterreinstall.ui.theme.DarkGreen
import com.example.afterreinstall.ui.theme.FernGreen
import com.example.afterreinstall.ui.theme.PakistanGreen
import com.example.afterreinstall.ui.theme.ResedaGreen

@Composable
fun AfterStartScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .background(ResedaGreen,
                        shape = RoundedCornerShape(24.dp))
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(25.dp)
                ) {
                    Text("Hello")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(//big green box
                modifier = Modifier
                    .background(ResedaGreen,
                        shape = RoundedCornerShape(24.dp))
                    .weight(5.5f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .padding(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .height(240.dp)
                            .width(240.dp)
                            .background(Color.White,
                                shape = RoundedCornerShape(120.dp)
                            )
                            .border(10.dp, DarkGreen, shape = RoundedCornerShape(120.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("05:38",
                                style = TextStyle(
                                    fontSize = 60.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.Black
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = FernGreen,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(80.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.PlayArrow,
                                    contentDescription = "Start",
                                    tint = Color.White,
                                    modifier = Modifier.size(60.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate(Screen.ChoosePod.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = FernGreen,
                            contentColor = Color.Black
                        )
                    ) {
                        Text("Choose Pods",
                            style = TextStyle(
                                fontSize = 20.sp,
                            ),
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(FernGreen, shape = RoundedCornerShape(24.dp))
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Second hit",
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            Row {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(DarkGreen, shape = RoundedCornerShape(24.dp))
                                        .padding(10.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("Pod 02",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                        ),
                                        color = Color.White
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(DarkGreen, shape = RoundedCornerShape(24.dp))
                                        .padding(10.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("2.8 sec",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                        ),
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(FernGreen, shape = RoundedCornerShape(24.dp))
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("First hit",
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            Row {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(DarkGreen, shape = RoundedCornerShape(24.dp))
                                        .padding(10.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("Pod 04",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                        ),
                                        color = Color.White
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(DarkGreen, shape = RoundedCornerShape(24.dp))
                                        .padding(10.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("1.9 sec",
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
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AfterStartScreenPre() {
    val navController = rememberNavController()
    AfterStartScreen(navController = navController)
}