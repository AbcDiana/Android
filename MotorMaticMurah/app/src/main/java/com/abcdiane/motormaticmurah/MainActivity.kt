package com.abcdiane.motormaticmurah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abcdiane.motormaticmurah.adapter.ListMotorAdapter
import com.abcdiane.motormaticmurah.model.Motor
import com.abcdiane.motormaticmurah.model.MotorData

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private var list: ArrayList<Motor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Motor Matic Murah"
        }

        rvMotor = findViewById(R.id.rv_motor)
        rvMotor.setHasFixedSize(true)

        list.addAll(MotorData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvMotor.layoutManager = LinearLayoutManager(this)
        val listMotorAdapter = ListMotorAdapter(list)
        rvMotor.adapter = listMotorAdapter

        listMotorAdapter.setOnItemClickCallback((object : ListMotorAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Motor) {
                showSelectedMotor(data)
            }
        }))

    }

    private fun showSelectedMotor(motor: Motor) {
        Toast.makeText(this, "Anda Memilih " + motor.name, Toast.LENGTH_SHORT).show()
        val moveDetail = Intent(this@MainActivity, DetailActivity::class.java)
        moveDetail.putExtra(DetailActivity.EXTRA_NAME, motor.name)
        moveDetail.putExtra(DetailActivity.EXTRA_PRICE, motor.price)
        moveDetail.putExtra(DetailActivity.EXTRA_DESK, motor.detail)
        moveDetail.putExtra(DetailActivity.EXTRA_IMG, motor.photo)
        moveDetail.putExtra(DetailActivity.EXTRA_MESIN, motor.mesin)
        moveDetail.putExtra(DetailActivity.EXTRA_CC, motor.cc)
        moveDetail.putExtra(DetailActivity.EXTRA_SISTEM, motor.sistem)
        moveDetail.putExtra(DetailActivity.EXTRA_DAYA, motor.daya)
        moveDetail.putExtra(DetailActivity.EXTRA_TORSI, motor.torsi)
        startActivity(moveDetail)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profil, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_profil -> {
                val moveProfile = Intent(this@MainActivity, ProfileActivity::class.java)
                moveProfile.putExtra(ProfileActivity.EXTRA_NAME, "Anton Diana")
                moveProfile.putExtra(ProfileActivity.EXTRA_EMAIL, "antondiana21@gmail.com")
                startActivity(moveProfile)
            }
        }
        return true
    }


}
