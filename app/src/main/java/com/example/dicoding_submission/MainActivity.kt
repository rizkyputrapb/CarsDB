package com.example.dicoding_submission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dicoding_submission.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mViewModel: CarsViewModel;
    private lateinit var binding: ActivityMainBinding
    var carList: MutableList<Cars>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.homeAppbar)
        supportActionBar?.setTitle("Cars List")
        setupRV()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_profile -> {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    fun setupRV() {
        carList = ArrayList()
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Skyline GTR R34",
                type = "Sports",
                manufacturer = "Nissan",
                modelYear = "1989",
                history = "The Nissan Skyline GT-R (Japanese: 日産・スカイラインGT-R, Nissan Sukairain GT-R) is a sports car based on the Nissan Skyline range. The first cars named \"Skyline GT-R\" were produced between 1969 and 1972 under the model code KPGC10, and were successful in Japanese touring car racing events. This model was followed by a brief production run of second-generation cars, under model code KPGC110, in 1973.",
                img = R.mipmap.ic_skyline
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Impreza WRX STI",
                type = "Rally Sports",
                manufacturer = "Subaru",
                modelYear = "1999",
                history = "The Subaru Impreza (Japanese: スバル・インプレッサ, Hepburn: Subaru Inpuressa) is a compact car that has been manufactured by Subaru since 1992. It was introduced as a replacement for the Leone, with the predecessor's EA series engines replaced by the new EJ series. It is now in its fifth generation.",
                img = R.mipmap.ic_impreza
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Lancer Evolution VI",
                type = "Rally Sport",
                manufacturer = "Mitsubishi",
                modelYear = "1999",
                history = "The Mitsubishi Lancer Evolution, commonly referred to as 'Evo', is a sports sedan based on the Lancer that was manufactured by Japanese manufacturer Mitsubishi Motors from 1992 until 2016. There have been ten official versions to date, and the designation of each model is most commonly a Roman numeral. All use two litre turbocharged inline four-cylinder engines and all-wheel drive systems.",
                img = R.mipmap.ic_lancer
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "RX7 FD3S",
                type = "Sports",
                manufacturer = "Mazda",
                modelYear = "1999",
                history = "The Mazda RX-7 is a front/mid-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations, all of which made use of a compact, lightweight Wankel rotary engine.",
                img = R.mipmap.ic_rx7
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "911 GT3 (996)",
                type = "Sports Touring",
                manufacturer = "Porsche",
                history = "The Porsche 911 GT3 is a high-performance homologation model of the Porsche 911 sports car. It is a line of high-performance models, which began with the 1973 911 Carrera RS. The GT3, introduced in 1999, is named after the Fédération Internationale de l'Automobile (FIA) Group GT3 class, in which its racing counterpart was designed to compete.",
                img = R.mipmap.ic_911,
                modelYear = "2000"
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Audi Sport Quattro",
                type = "Sport Rally",
                manufacturer = "Audi",
                history = "The Audi Quattro is a road and rally car, produced by the German automobile manufacturer Audi, part of the Volkswagen Group. It was first shown at the 1980 Geneva Motor Show on 3 March.[1][3] Production continued through 1991.",
                modelYear = "1983",
                img = R.mipmap.ic_quattro
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Delta HF Integrale Evo",
                type = "Sport Rally",
                manufacturer = "Lancia",
                history = "At the September 1991 Frankfurt Motor Show Lancia introduced an heavily revised Delta HF,[36] once again named Delta HF integrale—but which became better known as HF integrale \"Evoluzione\" or simply HF integrale \"Evo\". Evoluzione cars were built from October 1991 through 1992. At the end of the victorious 1991 World Rally Championship season, where the HF integrale 16v had won both the drivers' and manufacturers' championship, Lancia officially retired from rallying. Despite this, racing development of the HF integrale continued, and factory-developed HF integrale Evo were fielded by a now-independent Martini Racing-sponsored Jolly Club for the 1992 season. Thanks to the two factory backed privateer teams, Lancia won its sixth and final consecutive Constructor's World Rally Championship. These were to be the final homologation cars; the catalytic 1993 Evoluzione 2 was not developed by the factory into a rally car.",
                modelYear = "1991",
                img = R.mipmap.ic_delta
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Delta HF Integrale Evo",
                type = "Sport Rally",
                manufacturer = "Lancia",
                history = "At the September 1991 Frankfurt Motor Show Lancia introduced an heavily revised Delta HF,[36] once again named Delta HF integrale—but which became better known as HF integrale \"Evoluzione\" or simply HF integrale \"Evo\". Evoluzione cars were built from October 1991 through 1992. At the end of the victorious 1991 World Rally Championship season, where the HF integrale 16v had won both the drivers' and manufacturers' championship, Lancia officially retired from rallying. Despite this, racing development of the HF integrale continued, and factory-developed HF integrale Evo were fielded by a now-independent Martini Racing-sponsored Jolly Club for the 1992 season. Thanks to the two factory backed privateer teams, Lancia won its sixth and final consecutive Constructor's World Rally Championship. These were to be the final homologation cars; the catalytic 1993 Evoluzione 2 was not developed by the factory into a rally car.",
                modelYear = "1991",
                img = R.mipmap.ic_delta
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "Civic Type-R FK8",
                type = "Sports",
                manufacturer = "Honda",
                history = "The Type R Prototype was unveiled along with the production hatchback at the 2016 Paris Motor Show.[14][19] The prototype shared the same overall body as the regular hatchback but with a more performance-focused appearance. The Type R Prototype included unique brushed aluminium-effect paintwork, 20-inch piano black alloy wheels, a carbon fibre front splitter and a large rear spoiler.[20] The Civic Type R has a 2.0-liter turbocharged inline-four engine which produces 306 horsepower (228 kilowatts) and 295 pound-feet (400 Newton-meters) of torque. Fuel efficiency is rated at a combined consumption of 25 miles per gallon.[21]",
                modelYear = "2016",
                img = R.mipmap.ic_civic
            )
        )
        (carList as ArrayList<Cars>).add(
            Cars(
                name = "NSX-R GT",
                type = "Sports",
                manufacturer = "Honda",
                history = "Production of NSX-R GT, as limited edition of NSX-R, was approved at Honda solely to win at the JGTG and Super GT, because its production-based race car homologation required additional handicap weight for NSX reasoning by such as relatively small aero-projected-area and mid-ship layout, and overcoming the handicap was very difficult in 2003 and 2004 seasons.[39] As the Super GT rule required at least five production cars for any race car version to compete, the production of NSX-R GT was limited to the minimum number, and only one car was actually sold.",
                modelYear = "2005",
                img = R.mipmap.ic_nsxr
            )
        )
        val factory = CarsViewModelFactory(carList!!)
        val recyclerView = binding.rvCars
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setHasFixedSize(true)
        mViewModel = ViewModelProvider(this@MainActivity, factory).get(CarsViewModel::class.java)
        var adapter = CarsAdapter()
        recyclerView.setAdapter(adapter)
        mViewModel.listCarsLiveData().observe(this, { carList ->
            adapter.setCarsList(carList)
        })
        adapter.notifyDataSetChanged()
        adapter.setOnItemCallback(object : CarsAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Cars) {
                Toast.makeText(this@MainActivity, "You choose ${data.name}",Toast.LENGTH_SHORT)
            }
        })
    }
}