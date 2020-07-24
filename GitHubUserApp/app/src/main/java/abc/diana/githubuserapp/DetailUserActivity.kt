package abc.diana.githubuserapp

import abc.diana.githubuserapp.model.GitHubUser
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUserActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail User"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val list: GitHubUser = intent.getParcelableExtra(EXTRA_USER) as GitHubUser

        Glide.with(this).load(list.photo).apply(RequestOptions()).into(img_detail_photo)
        tv_detail_name.text = list.name
        tv_detail_username.text = list.username
        tv_detail_repository.text = list.Repository.toString()
        tv_detail_followers.text = list.Follower.toString()
        tv_detail_following.text = list.Following.toString()
        tv_detail_company.text = list.company
        tv_detail_location.text = list.location
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }
}
