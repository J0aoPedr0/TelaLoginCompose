package com.example.telalogincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var addressField = remember {
        mutableStateOf("") }
    var passwordField = remember {
        mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFFFFFF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)){

        Image(painter = painterResource(id = R.drawable.ic_login_image),
            contentDescription = "login image")

        Text(text = "Welcome Back",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold)

        Text(text = "Login to your account",
            fontSize = 16.sp)

        TextField(
            value = addressField.value,
            onValueChange = { novoValor ->
                addressField.value = novoValor
        },
            label =  {
                Text(text = "Email address")
            }
        )
        TextField(
            value = passwordField.value,
            onValueChange = { novoValor ->
                passwordField.value = novoValor
            },
            label =  {
                Text(text = "Password")
            }
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Text(text = "Forgot Password?",
            fontSize = 16.sp)
        
        Text(text = "Or sign in with",
            fontSize = 16.sp)
        Row {
            Image(painter = painterResource(id = R.drawable.ic_facebook), contentDescription = "Facebook image")
            Image(painter = painterResource(id = R.drawable.ic_google), contentDescription = "Google image")
            Image(painter = painterResource(id = R.drawable.ic_twiter), contentDescription = "Twitter image")
        }
    }
}