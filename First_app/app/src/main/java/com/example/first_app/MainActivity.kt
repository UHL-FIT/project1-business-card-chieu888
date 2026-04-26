package com.example.first_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_app.ui.theme.First_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            First_appTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFF327fa8)
                ) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val img = painterResource(R.drawable.img1)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(80.dp))

            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier.size(110.dp)
            )

            Text(
                text = "DINH VAN CHIEU",
                fontSize = 28.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(top = 16.dp)
            )

            Text(
                text = "Sinh vien Dai hoc Ha Long",
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            ContactItem(Icons.Default.Phone, "0356469464")
            ContactItem(Icons.Default.Share, "@DHHL")
            ContactItem(Icons.Default.Email, "chieu@810205.com")
        }
    }
}

@Composable
fun ContactItem(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    First_appTheme {
        BusinessCard()
    }
}