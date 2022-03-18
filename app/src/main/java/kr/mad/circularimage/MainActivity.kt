package kr.mad.circularimage

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.constraintlayout.utils.widget.ImageFilterView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    var image1: ImageView? = null
    var image2: ImageView? = null

    var image3: ImageFilterView? = null
    var image4: ShapeableImageView? = null

    var imageViewPicasso: ImageView? = null
    var imageViewGlide: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1 = findViewById<ImageView>(R.id.image1)
        image2 = findViewById<ImageView>(R.id.image2)
        image3 = findViewById<ImageFilterView>(R.id.image3)
        image4 = findViewById<ShapeableImageView>(R.id.image4)
        imageViewPicasso = findViewById<ImageView>(R.id.imageViewPicasso)
        imageViewGlide = findViewById<ImageView>(R.id.imageViewGlide)

        Picasso.get().load("http://placeimg.com/50/50/any").fit().centerCrop().placeholder(R.drawable.ic_launcher_background).into(image1)
        Picasso.get().load("http://placeimg.com/50/50/any").fit().centerCrop().placeholder(R.drawable.ic_launcher_background).into(image2)
        Picasso.get().load("http://placeimg.com/50/50/any").fit().centerCrop().placeholder(R.drawable.ic_launcher_background).into(image3)
        Picasso.get().load("http://placeimg.com/50/50/any").fit().centerCrop().placeholder(R.drawable.ic_launcher_background).into(image4)

        Picasso.get().load("http://placeimg.com/50/50/any").fit().transform( CircularTransformation()).placeholder(R.drawable.ic_launcher_background).into(imageViewPicasso)
        Glide.with(this).load("http://placeimg.com/50/50/any").circleCrop().placeholder(R.drawable.ic_launcher_background).into(imageViewGlide!!)

        //Picasso.get().load("http://placeimg.com/50/50/any").fit().ro
    }
}