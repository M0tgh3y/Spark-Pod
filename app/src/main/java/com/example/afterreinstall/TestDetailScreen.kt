package com.example.afterreinstall

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.BackHand
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.afterreinstall.ui.theme.DarkMoss
import com.example.afterreinstall.ui.theme.FernGreen
import com.example.afterreinstall.ui.theme.PakistanGreen
import com.example.afterreinstall.ui.theme.ResedaGreen


@Composable
fun TestDetailScreen(navController: NavHostController, onClick: () -> Unit) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = ResedaGreen
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    Text(text = "Test 9x4",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.weight(1f),
                        color = Color.White
                    )

                    IconButton(
                        onClick = { navController.navigate(Screen.PodSetting.route) }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = null,
                            modifier = Modifier.size(28.dp),
                            tint = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.pic1),
                contentDescription = "",
                modifier = Modifier
                    .height(240.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = ResedaGreen
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "Description:",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Mark two parallel lines 9 meters apart. Place two cones behind the start and finish lines. The athlete stands behind the starting line. When the start button is pressed, the athlete must run toward the opposite line and touch the cone, then return to the starting point and touch the second cone, and finally return to the starting point again. The athlete covers the 9-meter distance a total of four times, and the completion time is recorded.",
                        fontSize = 17.sp,
                        lineHeight = 20.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        chips("Reaction speed")
                        chips("Coordination")
                        chips("Endurance")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    InfoCardsRow(onClick)

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { navController.navigate(Screen.AfterStart.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = FernGreen,
                            contentColor = Color.White
                        )
                    ) {
                        Text("Continue",
                            style = TextStyle(
                                fontSize = 20.sp,
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

@Composable
fun chips(text: String) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = FernGreen
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .height(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                color = Color.White,
                style = TextStyle(
                    fontSize = 15.sp
                )
            )
        }
    }
}

@Composable
fun InfoCardsRow(onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .weight(1f)
                .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = DarkMoss
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Hit",
                        style = TextStyle(
                            fontSize = 18.sp
                        ),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Icon(
                        imageVector = Icons.Default.BackHand,
                        contentDescription = null,
                        modifier = Modifier.size(25.dp),
                        tint = Color.White
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .weight(1f)
                .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = DarkMoss
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Color",
                        style = TextStyle(
                            fontSize = 18.sp
                        ),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { onClick() },
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Red
                            )
                        ) { }
                        Spacer(modifier = Modifier.width(10.dp))
                        Button(
                            onClick = { onClick() },
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Green
                            )
                        ) { }
                    }
                }
            }
        }

        Card(
            modifier = Modifier
                .weight(1f)
                .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = DarkMoss
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Number",
                        style = TextStyle(
                            fontSize = 18.sp
                        ),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "2",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestDetailScreenPreview() {
    val navController = rememberNavController()

    TestDetailScreen(navController = navController, onClick = {})
}