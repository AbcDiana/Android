package abc.diana.githubuserapp

import abc.diana.githubuserapp.adapter.UserAdapter
import abc.diana.githubuserapp.model.GitHubUser
import android.content.Intent
import android.content.res.TypedArray
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list = ArrayList<GitHubUser>()

    private lateinit var dataPhoto: TypedArray
    private lateinit var dataName: Array<String>
    private lateinit var dataUsername: Array<String>
    private lateinit var dataRepository: Array<String>
    private lateinit var dataFollowers: Array<String>
    private lateinit var dataFollowing: Array<String>
    private lateinit var dataCompany: Array<String>
    private lateinit var dataLocation: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Github User's"
        }

        rv_github_user.setHasFixedSize(true)
        list.addAll(addItemUser())
        showRecyclerCardView()

    }

    private fun addItemUser(): ArrayList<GitHubUser> {
        dataPhoto = resources.obtainTypedArray(R.array.avatar)
        dataName = resources.getStringArray(R.array.name)
        dataUsername = resources.getStringArray(R.array.username)
        dataRepository = resources.getStringArray(R.array.repository)
        dataFollowers = resources.getStringArray(R.array.followers)
        dataFollowing = resources.getStringArray(R.array.following)
        dataCompany = resources.getStringArray(R.array.company)
        dataLocation = resources.getStringArray(R.array.location)

        val listUser = ArrayList<GitHubUser>()
        for (i in dataName.indices) {
            val user = GitHubUser(
                dataPhoto.getResourceId(i, -1),
                dataName[i],
                dataUsername[i],
                dataRepository[i].toInt(),
                dataFollowers[i].toInt(),
                dataFollowing[i].toInt(),
                dataCompany[i],
                dataLocation[i]
            )
            listUser.add(user)
        }
        return listUser
    }

    private fun showRecyclerCardView() {
        rv_github_user.layoutManager = LinearLayoutManager(this)
        val userAdapter = UserAdapter(list)
        rv_github_user.adapter = userAdapter

        userAdapter.setOnItemClickCallback((object : UserAdapter.OnItemClickCallback {
            override fun onItemClick(data: GitHubUser) {
                showSelectedUser(data)
            }
        }))
    }

    private fun showSelectedUser(githubUser: GitHubUser) {
        Toast.makeText(this, githubUser.name, Toast.LENGTH_SHORT).show()
        val detailUserIntent = Intent(this@MainActivity, DetailUserActivity::class.java)
        detailUserIntent.putExtra(DetailUserActivity.EXTRA_USER, githubUser)
        startActivity(detailUserIntent)
    }
}
