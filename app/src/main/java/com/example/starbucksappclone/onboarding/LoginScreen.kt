package com.example.starbucksappclone.onboarding

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.starbucksappclone.navigation.Screens
import com.example.starbucksappclone.screens.FloatingButton
import com.example.starbucksappclone.screens.LoginTextFieldWithIcon

@Composable
fun LoginScreen(
    navHostController: NavHostController
) {
   // val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBarLoginScreen(onClick = {navHostController.navigateUp()}) },
        floatingActionButton = {
            FloatingButton("Join now", onClick = {
                navHostController.navigate(
                    Screens.RewardsScreen.route
                )
            })
        }
    ) {
        LoginScreenContent(paddingValues = it)
    }
}

@Composable
fun TopAppBarLoginScreen(
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(end = 16.dp)
    ) {
        IconButton(onClick = { onClick() }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Sign in",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color(0xFF4CA569),
            modifier = Modifier.clickable { }
        )
    }
}

@Composable
fun LoginScreenContent(paddingValues: PaddingValues) {
    val scrollState = rememberScrollState()
    val isSwitchChecked = remember { mutableStateOf(false) }
    val isCheckBoxChecked = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            //   .padding(16.dp)
            .padding(paddingValues)
            .verticalScroll(scrollState)
    ) {
        Text(
            text = "Starbucks Rewards",
            style = TextStyle(
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Login Details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        LoginTextFieldWithIcon(
            label = "Email*",
            placeholder = "Enter your email here",
            keyboardType = KeyboardType.Email,
            modifier = Modifier.fillMaxWidth()
        )
        LoginTextFieldWithIcon(
            label = "Password*",
            placeholder = "Enter your password here",
            keyboardType = KeyboardType.Password,
            modifier = Modifier.fillMaxWidth()
        )
        LoginTextFieldWithIcon(
            label = "Confirm password*",
            placeholder = "Confirm password*",
            keyboardType = KeyboardType.Password,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = "Personal Information",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(28.dp))
        // Add drop down menu here
        LoginTextFieldWithIcon(
            label = "First Name*",
            placeholder = "First Name*",
            keyboardType = KeyboardType.Password,
            modifier = Modifier.fillMaxWidth()
        )
        LoginTextFieldWithIcon(
            label = "Last Name*",
            placeholder = "Last Name*",
            keyboardType = KeyboardType.Password,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(28.dp))
        Text(
            text = "Mobile Number (Optional)",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Row {
            Spacer(modifier = Modifier.width(16.dp))
            LoginTextFieldWithIcon(
                label = "Phone Number*",
                placeholder = "Phone Number*",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(0.5f)
            )
        }
        Spacer(modifier = Modifier.height(100.dp))

    }
}


