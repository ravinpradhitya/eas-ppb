package com.example.starbucksappclone.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.starbucksappclone.navigation.Screens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RewardsScreen(
    navHostController: NavHostController
) {
    Scaffold(
        floatingActionButton = {
            FloatingButton("Sign in", onClick = {
                navHostController.navigate(
                    Screens.RewardsLoginScreen.route
                )
            })
        }
    ) {
        RewardsScreenContent()
    }
}

@Composable
fun RewardsScreenContent() {
    Column(
        modifier = Modifier
            .background(Color(0xff233831))
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.Star,
            tint = Color(0xffC6A364),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Welcome to\nStarbucks Rewards",
            style = TextStyle(
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Verify your email address to get started! " +
                    "A verification link has been sent to your" +
                    "registered email address, click on the link to" +
                    "complete your registration." +
                    "If you do not receive the email within the" +
                    "next few minutes, please check your junk/" +
                    "spam folder.",
            style = TextStyle(
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        )
    }
}