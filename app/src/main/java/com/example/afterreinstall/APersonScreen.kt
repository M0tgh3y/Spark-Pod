package com.example.afterreinstall

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
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
fun APersonScreen(navController: NavHostController) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PakistanGreen),
            contentAlignment = Alignment.TopCenter
        ) {
            Column (
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = ResedaGreen
                    ),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Motahare Gheysari",
                            modifier = Modifier.weight(1f),
                            style = TextStyle(
                                fontSize = 18.sp,
                            ),
                            color = Color.White
                        )
                        Text(
                            "40240263",
                            style = TextStyle(
                                fontSize = 18.sp,
                            ),
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = ResedaGreen
                    ),
                    shape = RoundedCornerShape(24.dp),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Last Test:",
                                modifier = Modifier
                                    .weight(1f),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White

                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            Text(
                                "Test 9x4",
                                modifier = Modifier
                                    .weight(1f),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White

                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier.weight(1f),
                                border = BorderStroke(2.dp, Color.Black),
                                colors = CardDefaults.cardColors(
                                    containerColor = FernGreen
                                ),
                                shape = RoundedCornerShape(20.dp),
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(15.dp)
                                ) {
                                    Text(
                                        "Total Time",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                        ),
                                        color = Color.White

                                    )
                                    Spacer(modifier = Modifier.height(20.dp))

                                    Text("11.2",
                                        style = TextStyle(
                                            fontSize = 35.sp,
                                            fontWeight = FontWeight.Bold
                                        ),
                                        color = Color.White

                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Card(
                                modifier = Modifier.weight(1f),
                                border = BorderStroke(2.dp, Color.Black),
                                colors = CardDefaults.cardColors(
                                    containerColor = FernGreen
                                ),
                                shape = RoundedCornerShape(20.dp),
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(15.dp)
                                ) {
                                    Text("Best Time:",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                        ),
                                        color = Color.White
                                    )
                                    Spacer(modifier = Modifier.height(20.dp))
                                    Text("3.4",
                                        style = TextStyle(
                                            fontSize = 35.sp,
                                            fontWeight = FontWeight.Bold
                                        ),
                                        color = Color.White

                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = ResedaGreen
                    ),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text("chart",
                            style = TextStyle(
                                fontSize = 20.sp,
                            ),
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(200.dp))
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier.weight(1f),
                        colors = CardDefaults.cardColors(
                            containerColor = ResedaGreen
                        ),
                        shape = RoundedCornerShape(20.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)
                        ) {
                            Text(
                                "Best Time:",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White

                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            Text("10.6",
                                style = TextStyle(
                                    fontSize = 35.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.White

                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card(
                        modifier = Modifier.weight(1f),
                        colors = CardDefaults.cardColors(
                            containerColor = ResedaGreen
                        ),
                        shape = RoundedCornerShape(20.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)
                        ) {
                            Text(
                                "Average Time:",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            Text("11.2",
                                style = TextStyle(
                                    fontSize = 35.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.White
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button (
                            onClick = { navController.navigate(Screen.ReportPage.route) },
                            modifier = Modifier
                                .weight(1f)
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = FernGreen,
                                contentColor = Color.Black
                            )
                        ) {
                            Text("Report",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White
                            )
                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Button (
                            onClick = { navController.navigate(Screen.Test.route) },
                            modifier = Modifier
                                .weight(1f)
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = FernGreen,
                                contentColor = Color.Black
                            )
                        ) {
                            Text("New test",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun APersonScreenPre () {
    val navController = rememberNavController()
    APersonScreen(navController = navController)
}