package abc.diana.githubuserapp.adapter

import abc.diana.githubuserapp.R
import abc.diana.githubuserapp.model.GitHubUser
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_github_user.view.*

class UserAdapter(internal var listUser: ArrayList<GitHubUser>) :
    RecyclerView.Adapter<UserAdapter.CardViewViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_github_user, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        holder.bindItem(listUser[position])
    }

    override fun getItemCount(): Int = listUser.size

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(githubUser: GitHubUser) {
            with(itemView) {
                img_item_photo.setImageResource(githubUser.photo)
                tv_item_name.text = githubUser.name
                tv_item_username.text = githubUser.username
                tv_item_company.text = githubUser.company
                itemView.setOnClickListener { onItemClickCallback?.onItemClick(githubUser) }
            }
        }
    }

    fun setOnItemClickCallback(OnitemClickback: OnItemClickCallback) {
        this.onItemClickCallback = OnitemClickback
    }

    interface OnItemClickCallback {
        fun onItemClick(data: GitHubUser)
    }


}