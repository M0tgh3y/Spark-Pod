package com.example.afterreinstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.afterreinstall.ui.theme.DarkGreen
import com.example.afterreinstall.ui.theme.PakistanGreen

@Composable
fun AfterStartScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("After start Screen")

            Button(onClick = {
                navController.navigate(Screen.ChoosePod.route)
            }) {
                Text("Choose Pods")
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