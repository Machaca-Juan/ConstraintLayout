package com.example.constraintlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConstraintExample1()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConstraintExample1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConstraintExample2() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen, boxBlack, boxCyan) = createRefs()

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxBlue.top)
                    start.linkTo(boxBlue.end)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxMagenta.bottom)
                    start.linkTo(boxMagenta.end)
                }
        )
    }
}



@Preview(showBackground = true)
@Composable
fun ConstraintExample3() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen, boxBlack1, boxBlack2, boxCyan) = createRefs()

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                }
        )

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                }
        )

        Box(
            modifier = Modifier
                .size(41.666.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxBlue.end)
                }
        )

        Box(
            modifier = Modifier
                .size(41.666.dp)
                .background(Color.Black)
                .constrainAs(boxBlack1) {
                    bottom.linkTo(boxCyan.top)
                    start.linkTo(boxCyan.end)
                }
        )

        Box(
            modifier = Modifier
                .size(41.666.dp)
                .background(Color.Black)
                .constrainAs(boxBlack2) {
                    bottom.linkTo(boxBlack1.top)
                    start.linkTo(boxBlack1.end)
                }
        )

    }
}