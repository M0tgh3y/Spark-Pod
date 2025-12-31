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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Battery2Bar
import androidx.compose.material.icons.filled.Battery4Bar
import androidx.compose.material.icons.filled.BatteryFull
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afterreinstall.ui.theme.ChoosedGreen
import com.example.afterreinstall.ui.theme.DontPick
import com.example.afterreinstall.ui.theme.FernGreen
import com.example.afterreinstall.ui.theme.PakistanGreen
import com.example.afterreinstall.ui.theme.ResedaGreen

@Composable
fun ChoosePodsScreen() {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen)
            .verticalScroll(scrollState),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Choose Pods",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold),
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(ResedaGreen, shape = RoundedCornerShape(24.dp))
                    .wrapContentWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Choose the starting Pod",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(ChoosedGreen, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 04",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Battery4Bar,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))
                                
                                Text("68%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(FernGreen, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 02",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.BatteryFull,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                Text("93%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(FernGreen, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 01",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Battery2Bar,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                Text("42%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.White,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(ResedaGreen, shape = RoundedCornerShape(24.dp))
                    .wrapContentWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Choose the ending Pod",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(DontPick, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 04",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Battery4Bar,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                Text("68%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(ChoosedGreen, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 02",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.BatteryFull,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                Text("93%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(FernGreen, shape = RoundedCornerShape(20.dp))
                            .padding(start = 15.dp, end = 15.dp)
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Pod 01",
                                style = TextStyle(
                                    fontSize = 20.sp
                                ),
                                color = Color.White
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Battery2Bar,
                                    contentDescription = "Home",
                                    modifier = Modifier.rotate(90f)
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                Text("42%",
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    )
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = "lamp",
                            tint = Color.White,
                            modifier = Modifier
                                .size(26.dp),
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Icon(
                            imageVector = Icons.Default.Wifi,
                            contentDescription = "Wifi",
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp),
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChoosePodScreenPre() {
    ChoosePodsScreen()
}