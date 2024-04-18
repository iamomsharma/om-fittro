package `in`.fittro.management.onboarding.createcenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import `in`.fittro.management.databinding.ActivityCreateCenterBinding

class CreateCenterActivity : AppCompatActivity() {


    private lateinit var binding: ActivityCreateCenterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCenterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}