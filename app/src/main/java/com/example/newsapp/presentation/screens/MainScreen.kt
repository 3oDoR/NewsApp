package com.example.newsapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapp.R

@Preview(showBackground = true)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val category =
        listOf("Business", "Entertainment", "General", "Health", "Science", "Sports", "Technology")

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(category.size) {
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = category[it],
                    fontWeight = FontWeight.Bold
                )
            }
        }
        ChooseWeather()
        LazyColumn {
            items(25) {
                OneNews()
            }
        }
    }
}

@Composable
fun ChooseWeather() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_location),
                    contentDescription = "Icon location"
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
                    text = "Choose city"
                )
            }
            Text(
                text = "ср, 5 мар. 2025, 20:01"
            )
        }
        Image(
            painter = painterResource(R.drawable.ic_sunny),
            contentDescription = "Icon location",
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
fun OneNews() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .size(height = 200.dp, width = 150.dp),
        painter = painterResource(R.drawable.ic_sunny),
        contentDescription = "News Image",
        contentScale = ContentScale.Fit
    )
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = "Apple AirTag 4-Pack Drops to Below \$70 on Amazon, That’s Under \$18 Each"
    )
    Text(
        text = ": \"2025-03-05T13:10:16Z\","
    )
}
