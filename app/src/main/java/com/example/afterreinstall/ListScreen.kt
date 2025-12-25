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
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
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
fun ListScreen(navController: NavHostController, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(start = 25.dp, end = 25.dp, top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "List's",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.weight(1f),
                    color = Color.White
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

            Spacer(modifier = Modifier.height(20.dp))

            ClassButton(classes, navController)

            Button(
                onClick = { navController.navigate(Screen.AddList.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = FernGreen,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Create New List",
                    style = TextStyle(
                        fontSize = 20.sp,
                    ),
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun ClassButton(classes: List<List<String>>, navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        classes.forEach { c ->
            FilledTonalButton(
                onClick = { navController.navigate(Screen.NameList.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ResedaGreen,
                    contentColor = Color.Black
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier
                        .weight(1f)
                        .padding(start = 5.dp)) {
                        Text(
                            text = c[0],
                            fontSize = 22.sp,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = c[1],
                            fontSize = 15.sp,
                            color = Color(0xFFECEFF1)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}

val classes = listOf(
    listOf("Class 1", "1404.06.13"),
    listOf("Class 2", "1404.07.25"),
    listOf("Class 3", "1404.07.29")
)

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    val navController = rememberNavController()
    ListScreen(navController = navController, onClick = {})
}