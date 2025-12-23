package com.example.afterreinstall

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
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

@Composable
fun APersonScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(start = 25.dp, top = 20.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFACD4D5)
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
                        )
                    )
                    Text(
                        "40240263",
                        style = TextStyle(
                                fontSize = 18.sp,
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFACD4D5)
                ),
                shape = RoundedCornerShape(24.dp),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 30.dp),
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
                            )
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            "Test 9x4",
                            modifier = Modifier
                                .weight(1f),
                            style = TextStyle(
                                fontSize = 20.sp,
                            )
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
                                containerColor = Color(0xFF1981C1)
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
                                    )
                                )
                                Spacer(modifier = Modifier.height(20.dp))

                                Text("11.2",
                                    style = TextStyle(
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            modifier = Modifier.weight(1f),
                            border = BorderStroke(2.dp, Color.Black),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF1981C1)
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
                                    )
                                )
                                Spacer(modifier = Modifier.height(20.dp))
                                Text("3.4",
                                    style = TextStyle(
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
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
fun APersonScreenPre () {
    val navController = rememberNavController()
    APersonScreen(navController = navController)
}