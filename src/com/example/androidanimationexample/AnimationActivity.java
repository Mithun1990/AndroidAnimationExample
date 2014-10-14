package com.example.androidanimationexample;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.androidanimations.library.fading_entrances.FadeInUpAnimator;
import com.easyandroidanimations.library.BounceAnimation;
import com.easyandroidanimations.library.FlipHorizontalAnimation;
import com.easyandroidanimations.library.ParallelAnimator;
import com.easyandroidanimations.library.ScaleInAnimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AnimationActivity extends Activity implements OnClickListener {

	Button Flush, Wobble, Bounce, RollIn, RollOut, Dropout, BounceIn, Swing,
			BounceUp, FadeIn, FadeOut, FadeInUp, FlipInX, FlipOutX, FlipOutY,
			RoteteIn, RotateOut, SlideInRight, SlideInLeft, SlideOutRight,
			SlideOutLeft, ZoomIn, ZoomOut, ZoomInUp, ZoomOutUp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
		Flush = (Button) findViewById(R.id.buttonFlash);
		Wobble = (Button) findViewById(R.id.buttonWobble);
		Bounce = (Button) findViewById(R.id.buttonSwing);
		RollIn = (Button) findViewById(R.id.buttonRollIn);
		RollOut = (Button) findViewById(R.id.buttonRollOut);
		Dropout = (Button) findViewById(R.id.buttonDropout);
		BounceIn = (Button) findViewById(R.id.buttonBounceIn);
		Swing = (Button) findViewById(R.id.buttonBounceOut);
		BounceUp = (Button) findViewById(R.id.buttonBounceUp);
		FadeIn = (Button) findViewById(R.id.buttonFadeIn);
		FadeOut = (Button) findViewById(R.id.buttonFadeOut);
		FadeInUp = (Button) findViewById(R.id.buttonFadeInUp);
		FlipInX = (Button) findViewById(R.id.buttonFlipInX);
		FlipOutX = (Button) findViewById(R.id.buttonFlipOutX);
		FlipOutY = (Button) findViewById(R.id.buttonFlipOutY);
		RoteteIn = (Button) findViewById(R.id.buttonRotateIn);
		RotateOut = (Button) findViewById(R.id.buttonRotateOut);
		SlideInRight = (Button) findViewById(R.id.buttonSlideInRight);
		SlideInLeft = (Button) findViewById(R.id.buttonSlideInLeft);
		SlideOutRight = (Button) findViewById(R.id.buttonSlideOutRight);
		SlideOutLeft = (Button) findViewById(R.id.buttonSlideOutLeft);
		ZoomIn = (Button) findViewById(R.id.buttonZoomIn);
		ZoomOut = (Button) findViewById(R.id.buttonZoomOut);
		ZoomInUp = (Button) findViewById(R.id.buttonZoomInUp);
		ZoomOutUp = (Button) findViewById(R.id.buttonZoomOutUp);

		Flush.setOnClickListener(this);
		Wobble.setOnClickListener(this);
		Bounce.setOnClickListener(this);
		RollIn.setOnClickListener(this);
		RollOut.setOnClickListener(this);
		Dropout.setOnClickListener(this);
		BounceIn.setOnClickListener(this);
		Swing.setOnClickListener(this);
		BounceUp.setOnClickListener(this);
		FadeIn.setOnClickListener(this);
		FadeOut.setOnClickListener(this);
		FadeInUp.setOnClickListener(this);
		FlipInX.setOnClickListener(this);
		FlipOutX.setOnClickListener(this);
		FlipOutY.setOnClickListener(this);
		RoteteIn.setOnClickListener(this);
		RotateOut.setOnClickListener(this);
		SlideInRight.setOnClickListener(this);
		SlideInLeft.setOnClickListener(this);
		SlideOutRight.setOnClickListener(this);
		SlideOutLeft.setOnClickListener(this);
		ZoomIn.setOnClickListener(this);
		ZoomOut.setOnClickListener(this);
		ZoomInUp.setOnClickListener(this);
		ZoomOutUp.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.buttonSwing:
			YoYo.with(Techniques.Swing).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonFlash:
			YoYo.with(Techniques.Flash).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonWobble:
			YoYo.with(Techniques.Wobble).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonRollIn:
			YoYo.with(Techniques.RollIn).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonRollOut:
			YoYo.with(Techniques.RollOut).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonDropout:
			YoYo.with(Techniques.DropOut).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonBounceIn:
			YoYo.with(Techniques.BounceIn).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonBounceOut:
			YoYo.with(Techniques.Bounce).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonBounceUp:
			YoYo.with(Techniques.BounceInUp).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonFadeIn:
			YoYo.with(Techniques.FadeIn).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonFadeOut:
			YoYo.with(Techniques.FadeOut).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonFadeInUp:
			YoYo.with(Techniques.FadeInUp).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonFlipInX:
			YoYo.with(Techniques.FlipInX).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonFlipOutX:
			YoYo.with(Techniques.FlipOutX).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonFlipOutY:
			YoYo.with(Techniques.FlipOutY).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonRotateIn:
			YoYo.with(Techniques.RotateIn).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonRotateOut:
			YoYo.with(Techniques.RotateOut).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonSlideInLeft:
			YoYo.with(Techniques.SlideInLeft).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonSlideInRight:
			YoYo.with(Techniques.SlideInRight).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonSlideOutLeft:
			YoYo.with(Techniques.SlideOutLeft).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonSlideOutRight:
			YoYo.with(Techniques.SlideOutRight).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonZoomIn:
			YoYo.with(Techniques.ZoomIn).duration(1000)
					.playOn(findViewById(R.id.idAnm));

			break;

		case R.id.buttonZoomOut:
			YoYo.with(Techniques.ZoomOut).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonZoomInUp:
			YoYo.with(Techniques.ZoomInUp).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		case R.id.buttonZoomOutUp:
			YoYo.with(Techniques.ZoomOutUp).duration(1000)
					.playOn(findViewById(R.id.idAnm));
			break;

		default:
			break;
		}

	}

}
