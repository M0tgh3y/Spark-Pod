package com.example.afterreinstall

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddAPersonScreen(onClick: () -> Unit) {
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
            Text("Add a person screen")

            OutlinedTextField(
                state = rememberTextFieldState(),
                placeholder = { Text("") },
                label = { Text("First and last name") },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                state = rememberTextFieldState(),
                placeholder = { Text("") },
                label = { Text("Student number") },
                modifier = Modifier.fillMaxWidth()
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    state = rememberTextFieldState(),
                    placeholder = { Text("") },
                    label = { Text("Height") },
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.width(20.dp))

                OutlinedTextField(
                    state = rememberTextFieldState(),
                    placeholder = { Text("") },
                    label = { Text("Weight") },
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.width(20.dp))

                OutlinedTextField(
                    state = rememberTextFieldState(),
                    placeholder = { Text("") },
                    label = { Text("Age") },
                    modifier = Modifier.weight(1f)
                )
            }

            OutlinedTextField(
                state = rememberTextFieldState(),
                placeholder = { Text("") },
                label = { Text("ID number") },
                modifier = Modifier.fillMaxWidth()
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { onClick() }, modifier = Modifier.weight(1f)) {
                    Text("Submit")
                }

                OutlinedButton(onClick = { onClick() }, modifier = Modifier.weight(1f)) {
                    Text("Cancel")
                }
            }
        }
    }
}