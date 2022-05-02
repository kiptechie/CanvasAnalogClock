package com.kiptechie.canvasanalogclock.models

sealed class ClockLineType {
    object Minutes : ClockLineType()
    object Hours : ClockLineType()
}