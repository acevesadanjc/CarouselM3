package com.example.carouselm3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carouselm3.adapter.ImageAdapter
import com.example.carouselm3.databinding.ActivityCarouselBinding
import com.google.android.material.carousel.CarouselLayoutManager

class Carousel : AppCompatActivity() {

    private lateinit var binding: ActivityCarouselBinding
    private val lstUrl: MutableList<String> = mutableListOf()
    private val lstImage: MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCarouselBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        lstUrl.add("https://plus.unsplash.com/premium_photo-1710799499290-14b859e4fb6d?q=80&w=1471&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        lstUrl.add("https://images.unsplash.com/photo-1710866566821-faec7d460f0e?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        lstUrl.add("https://images.unsplash.com/photo-1683009426952-13567b4fa28b?q=80&w=1319&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        lstUrl.add("https://images.unsplash.com/photo-1707343845208-a20c56d2c8ba?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        lstUrl.add("https://images.unsplash.com/photo-1590845947670-c009801ffa74?q=80&w=1459&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        lstUrl.add("https://media.istockphoto.com/id/1323925941/es/foto/bombilla-led-blanca-sobre-fondo-amarillo-con-espacio-de-copia.webp?s=1024x1024&w=is&k=20&c=nzF2BGgVN8yTWSaJha2EfbbKLmsjryFFGG058e0uXio=")
        lstUrl.add("https://media.istockphoto.com/id/1468842625/es/foto/representaci%C3%B3n-3d-de-la-bombilla-y-el-s%C3%ADmbolo-de-la-escala-de-carga-de-ideas-sobre-fondo.jpg?s=1024x1024&w=is&k=20&c=044Jv0HFs6C9y8aKtFzL0mG0hjOup9b71FUF173uqWk=")
        lstUrl.add("https://media.istockphoto.com/id/1159168737/es/foto/ideas-conceptos-de-inspiraci%C3%B3n-con-grupo-de-bombillas-sobre-fondo-de-color-pastel-creatividad.jpg?s=1024x1024&w=is&k=20&c=Y_FmWA7ncg9jnGLtatkA5LiEO5tz4umtPVBsD57d_HE=")
        lstUrl.add("https://media.istockphoto.com/id/1142520138/es/foto/las-bombillas-de-colores.webp?s=1024x1024&w=is&k=20&c=c9dZ4EHL2kAtd977Kv3LNYJHIpgR-ge2UIN0Mb_LmbE=")
        lstUrl.add("https://media.istockphoto.com/id/1171435085/es/foto/concepto-de-idea-e-innovaci%C3%B3n.webp?s=1024x1024&w=is&k=20&c=mcBGUiLeHPMTbPHw5zV9HaO2GwXiQRWpqAxLSb3GLLU=")
*/
/*
        lstImage.add(R.drawable.banner_cambio_equipo)
        lstImage.add(R.drawable.banner_pago_en_linea_post)
        lstImage.add(R.drawable.banner_sucusal_acc_v1)
        lstImage.add(R.drawable.banner_sucusal_hogar_v1)
        lstImage.add(R.drawable.banner_sucusal_pet_v1)
        lstImage.add(R.drawable.banner_turno_digital_post)
*/
        //lstImage.add(R.drawable.banner_moustro)
        //lstImage.add(R.drawable.banner_moustro_2)
        //lstImage.add(R.drawable.banner_moustro_3)
        //lstImage.add(R.drawable.banner_moustro_4)
        lstImage.add(R.drawable.banner_4_1)
        lstImage.add(R.drawable.banner_4_2)


/*      lstImage.add(R.drawable.banner_camp_copa_america)
        lstImage.add(R.drawable.banner_motorola)
        lstImage.add(R.drawable.banner_nuevas_lineas)
        lstImage.add(R.drawable.banner_whatsapp)
*/
        val adapter = ImageAdapter(this, lstUrl, lstImage)
        binding.rvCarousel.layoutManager = CarouselLayoutManager()
        binding.rvCarousel.adapter = adapter

    }

}