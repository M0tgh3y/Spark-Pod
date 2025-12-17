package com.example.afterreinstall

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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun TestScreen(navController: NavHostController, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(start = 25.dp, end = 25.dp),
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
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.weight(1f)
                )

                IconButton(
                    onClick = { onClick() }
                ) {
                    Icon(
                        imageVector = Icons.Default.DensityMedium,
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            TestButton(test, navController)

            Button(
                onClick = { navController.navigate(Screen.ChoosePerson.route) },
                modifier = Modifier.padding(bottom = 20.dp)) {
                Text("Add a test")
            }
        }
    }
}

@Composable
fun TestButton(test: List<String>, navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        for(t in test) {
            Button(
                onClick = { navController.navigate(Screen.ChoosePerson.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = t,
                    style = TextStyle(
                        fontSize = 20.sp
                    ))
            }
            Spacer(modifier = Modifier.height(14.dp))
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