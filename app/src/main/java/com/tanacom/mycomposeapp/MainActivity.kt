package com.tanacom.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.tanacom.mycomposeapp.ui.presentation.onboarding.OnboardingScreen
import com.tanacom.mycomposeapp.ui.theme.MyComposeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComposeAppTheme(
                dynamicColor = false
            ) {
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
                    OnboardingScreen()
                }


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ShowMain() {
    MyComposeAppTheme(
        dynamicColor = false
    ) {
        Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
            OnboardingScreen()
        }

    }

}