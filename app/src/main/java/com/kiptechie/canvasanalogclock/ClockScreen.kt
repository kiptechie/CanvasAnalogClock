package com.kiptechie.canvasanalogclock

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kiptechie.canvasanalogclock.components.ClockCanvas
import com.kiptechie.canvasanalogclock.models.Time

@Composable
fun CLockScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var time by remember {
                mutableStateOf(Time())
            }
            Text(
                text = "${time.hours}:${time.minutes}:${time.seconds} ${time.amOrPm}",
                fontSize = 32.sp
            )
            Spacer(modifier = Modifier.height(32.dp))
            ClockCanvas(
                onCurrentTimeUpdated = { _time ->
                    time = _time
                }
            )
        }
    }
}