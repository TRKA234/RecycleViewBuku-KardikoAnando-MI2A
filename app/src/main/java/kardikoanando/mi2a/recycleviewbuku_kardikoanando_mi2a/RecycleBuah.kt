package kardikoanando.mi2a.recycleviewbuku_kardikoanando_mi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kardikoanando.mi2a.recycleviewbuku_kardikoanando_mi2a.adapter.BuahAdapter
import kardikoanando.mi2a.recycleviewbuku_kardikoanando_mi2a.model.Mocklist
import kardikoanando.mi2a.recycleviewbuku_kardikoanando_mi2a.model.ModelBuah

class RecycleBuah : AppCompatActivity() {

    private lateinit var rv_buah : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah)

        rv_buah = findViewById(R.id.rv_buah)

        rv_buah.layoutManager = GridLayoutManager(this, 1)
        val adapter = BuahAdapter(Mocklist.getModel() as ArrayList<ModelBuah>)
        rv_buah.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}