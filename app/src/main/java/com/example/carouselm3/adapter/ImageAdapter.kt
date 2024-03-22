package com.example.carouselm3.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carouselm3.databinding.ListItemBinding

class ImageAdapter(
    private val activity: Activity,
    private val lstUrls: List<String>,
    private val lstImage: List<Int>
) : RecyclerView.Adapter<ImageAdapter.BannerHolder>() {

    inner class BannerHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(url: String?, image: Int?) {
            setImage(activity, url, image, binding.imvItem)
            binding.imvItem.setOnClickListener {
                Toast.makeText(activity, "Banner", Toast.LENGTH_LONG).show()
            }
        }

        private fun setImage(
            activity: Activity?,
            url: String?,
            image: Int?,
            imageView: ImageView?
        ) {
            if (!url.isNullOrEmpty()) {
                Glide.with(activity!!).load(url).into(imageView!!)
            } else {
                //imageView?.setImageDrawable(ContextCompat.getDrawable(activity!!, image!!))
                imageView?.setImageResource(image!!)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BannerHolder(binding)
    }

    override fun onBindViewHolder(holder: BannerHolder, position: Int) {
        var url: String? = null
        var image: Int? = null
        if (isNotEmptyUrlList()) {
            url = lstUrls[position]
        } else {
            image = lstImage[position]
        }
        holder.bind(url, image)
    }

    override fun getItemCount(): Int {
        return if (isNotEmptyUrlList()) {
            lstUrls.size
        } else {
            lstImage.size
        }
    }

    private fun isNotEmptyUrlList(): Boolean = lstUrls.isNotEmpty()
}