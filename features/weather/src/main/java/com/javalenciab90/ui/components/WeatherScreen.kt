package com.javalenciab90.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.javalenciab90.theme.WeatherAppTheme
import com.javalenciab90.ui.viewmodel.State

@Composable
fun WeatherScreen(
    pageContent: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {

        },
        content = {
            pageContent(it)
        }
    )
}

@Preview
@Composable
private fun WeatherScreenPreview() {
    WeatherAppTheme {
        WeatherScreen { paddingValues ->
            WeatherBody(
                uiState = State(),
                onHandleIntent = {},
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}