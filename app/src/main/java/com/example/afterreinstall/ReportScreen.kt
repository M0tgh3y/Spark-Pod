package com.example.afterreinstall

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ReportScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.padding(start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Report page",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = Modifier.height(25.dp))

            TestReportCard(testReport)
        }
    }
}

@Composable
fun TestReportCard(testReport: List<List<String>>) {

    var expandedIndex by remember { mutableStateOf<Int?>(null) }

    testReport.forEachIndexed { index, test ->

        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = test[0],
                        fontSize = 22.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = test[1],
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                }

                Box {
                    IconButton(
                        onClick = { expandedIndex = index }
                    ) {
                        Icon(
                            imageVector = Icons.Default.DensityMedium,
                            contentDescription = null,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    DropdownMenuWithDetails(
                        expanded = expandedIndex == index,
                        onDismiss = { expandedIndex = null }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun DropdownMenuWithDetails(
    expanded: Boolean,
    onDismiss: () -> Unit
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismiss
    ) {

        DropdownMenuItem(
            text = { Text("View") },
            leadingIcon = {
                Icon(Icons.Default.RemoveRedEye, contentDescription = null)
            },
            onClick = {
                onDismiss()
            }
        )

        DropdownMenuItem(
            text = { Text("Download") },
            leadingIcon = {
                Icon(Icons.Default.Download, contentDescription = null)
            },
            onClick = {
                onDismiss()
            }
        )

        DropdownMenuItem(
            text = { Text("Delete") },
            leadingIcon = {
                Icon(Icons.Default.Delete, contentDescription = null)
            },
            onClick = {
                onDismiss()
            }
        )
    }
}

val testReport = listOf(
    listOf("Test 9x4", "1404.08.12"),
    listOf("Shuttle Run Test", "1404.08.05"),
    listOf("Test 9x4", "1404.07.25")
)
