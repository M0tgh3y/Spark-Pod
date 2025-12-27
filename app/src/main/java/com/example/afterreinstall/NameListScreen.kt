package com.example.afterreinstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
fun NameListScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PakistanGreen),
        contentAlignment = Alignment.TopCenter
    ) {
        Column (
            modifier = Modifier.padding(start = 25.dp, end = 25.dp, top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                Text(
                    text = "Class 1",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            NameCard(names, navController)

            Button(
                onClick = { navController.navigate(Screen.AddPerson.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = FernGreen,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
            ) {
                Text(
                    text = "Add new person",
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
fun NameCard(names: List<String>, navController: NavHostController) {

    for (name in names) {
        Button (
            onClick = { navController.navigate(Screen.PersonPage.route) },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ResedaGreen,
                contentColor = Color.Black
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = name,
                    style = TextStyle(
                        fontSize = 20.sp,
                    ),
                    modifier = Modifier.weight(1f),
                    color = Color.White
                )

                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = Color.White
                )

                Spacer(modifier = Modifier.width(20.dp))

                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}

var names = listOf("Ali Ashkanani", "Motahare Gheysari", "Maede Jebeli", "Ali Ashkanani", "Motahare Gheysari", "Maede Jebeli")

@Preview(showBackground = true)
@Composable
fun NameListScreenPreview() {
    val navController = rememberNavController()
    NameListScreen(navController = navController)
}