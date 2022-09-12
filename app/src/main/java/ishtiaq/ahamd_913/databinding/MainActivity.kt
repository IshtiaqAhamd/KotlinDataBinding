package ishtiaq.ahamd_913.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ishtiaq.ahamd_913.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainXML: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val p = Product("Ali baba")
        mainXML.product = p
    }
}