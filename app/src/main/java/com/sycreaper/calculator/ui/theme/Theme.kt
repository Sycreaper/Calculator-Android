package com.sycreaper.calculator.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun CalculatorPrepTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}