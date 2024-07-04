package com.example.telalogincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var addressField by remember {
        mutableStateOf("")
    }
    var passwordField by remember {
        mutableStateOf("")
    }

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(color = 0xFFFFFFFF)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            modifier = Modifier.size(300.dp),
            painter = painterResource(id = R.drawable.ic_login_image),
            contentDescription = "login image"
        )

        Text(
            text = "Bem vindo",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Faça login na sua conta",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = addressField,
            onValueChange = {
                addressField = it
            },
            label = {
                Text(text = "Email")
            }
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = passwordField,
            onValueChange = {
                passwordField = it
            },
            label = {
                Text(text = "Senha")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Logar")
        }
        Spacer(modifier = Modifier.height(32.dp))

        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Esqueçeu a senha?",
                fontSize = 16.sp
            )
        }
        Text(
            text = "Ou entre com",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook image",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { })
            Image(painter = painterResource(id = R.drawable.google),
                contentDescription = "Google image",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { })
            Image(painter = painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter image",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { })

        }
    }
}