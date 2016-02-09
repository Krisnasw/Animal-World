package com.example.animalworld;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;

public class Menu_utama extends Activity {
	private MediaPlayer MPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_utama);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		buka_file_suara();
		play_intro();
	}
	private void play_intro() {
		if (MPlayer != null && !MPlayer.isPlaying()){
			MPlayer.setLooping(true);
		MPlayer.start();
		}else{
			MPlayer.setLooping(true);
		}
	}
	private void stop() {
		MPlayer.stop();
		try {
			MPlayer.prepare();
			MPlayer.seekTo(0);
		} catch (Throwable t) {
			error_(t);
		}
	}
	private void stop_intro() {
		if (MPlayer.isPlaying()) {
			stop();
		}
	}
	private void buka_file_suara() {
		try {
			MPlayer = MediaPlayer.create(this, R.raw.intro);
		} catch (Throwable t) {
			error_(t);
		}
	}
	private void error_(Throwable t) {
		AlertDialog.Builder pesan_error = new AlertDialog.Builder(this);
		pesan_error.setTitle("Failed!").setMessage(t.toString())
				.setPositiveButton("OK", null).show();
	}
	public void btn_bee_Clicked(View v) {
		Intent panggil_class = new Intent(this, BeeActivity.class);
		startActivity(panggil_class);
	}
	public void btn_bird_Clicked(View v) {
		Intent panggil_class = new Intent(this, BirdActivity.class);
		startActivity(panggil_class);
	}
	public void btn_boar_Clicked(View v) {
		Intent panggil_class = new Intent(this, BoarActivity.class);
		startActivity(panggil_class);
	}
	public void btn_cat_Clicked(View v) {
		Intent panggil_class = new Intent(this, CatActivity.class);
		startActivity(panggil_class);
	}
	public void btn_chicken_Clicked(View v) {
		Intent panggil_class = new Intent(this, ChickenActivity.class);
		startActivity(panggil_class);
	}
	public void btn_chimpanzee_Clicked(View v) {
		Intent panggil_class = new Intent(this, ChimpanzeeActivity.class);
		startActivity(panggil_class);
	}
	public void btn_cow_Clicked(View v) {
		Intent panggil_class = new Intent(this, CowActivity.class);
		startActivity(panggil_class);
	}
	public void btn_dog_Clicked(View v) {
		Intent panggil_class = new Intent(this, DogActivity.class);
		startActivity(panggil_class);
	}
	public void btn_duck_Clicked(View v) {
		Intent panggil_class = new Intent(this, DuckActivity.class);
		startActivity(panggil_class);
	}
	public void btn_eagle_Clicked(View v) {
		Intent panggil_class = new Intent(this, EagleActivity.class);
		startActivity(panggil_class);
	}
	public void btn_elephant_Clicked(View v) {
		Intent panggil_class = new Intent(this, ElephantActivity.class);
		startActivity(panggil_class);
	}
	public void btn_geese_Clicked(View v) {
		Intent panggil_class = new Intent(this, GeeseActivity.class);
		startActivity(panggil_class);
	}
	public void btn_gorilla_Clicked(View v) {
		Intent panggil_class = new Intent(this, GorillaActivity.class);
		startActivity(panggil_class);
	}
	public void btn_horse_Clicked(View v) {
		Intent panggil_class = new Intent(this, HorseActivity.class);
		startActivity(panggil_class);
	}
	public void btn_leopard_Clicked(View v) {
		Intent panggil_class = new Intent(this, LeopardActivity.class);
		startActivity(panggil_class);
	}
	public void btn_lion_Clicked(View v) {
		Intent panggil_class = new Intent(this, LionActivity.class);
		startActivity(panggil_class);
	}
	public void btn_monkey_Clicked(View v) {
		Intent panggil_class = new Intent(this, MonkeyActivity.class);
		startActivity(panggil_class);
	}
	public void btn_pig_Clicked(View v) {
		Intent panggil_class = new Intent(this, PigActivity.class);
		startActivity(panggil_class);
	}
	public void btn_sheep_Clicked(View v) {
		Intent panggil_class = new Intent(this, SheepActivity.class);
		startActivity(panggil_class);
	}
	public void btn_tiger_Clicked(View v) {
		Intent panggil_class = new Intent(this, TigerActivity.class);
		startActivity(panggil_class);
	}
	public void btn_about_Clicked(View v) {
		Intent panggil_class = new Intent(this, About.class);
		startActivity(panggil_class);
	}
	@Override
	public void onBackPressed() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Tutup Aplikasi Animal World ?")
				.setCancelable(false)
				.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int id) {
						Intent keluar = new Intent(Intent.ACTION_MAIN);
						keluar.addCategory(Intent.CATEGORY_HOME);
						keluar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						stop_intro();
						finish();
						startActivity(keluar);
					}
				})
				.setNegativeButton("Tidak",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						}).show();
	}

}
