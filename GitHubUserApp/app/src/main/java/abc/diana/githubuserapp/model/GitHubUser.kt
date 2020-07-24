package abc.diana.githubuserapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GitHubUser(
    var photo: Int,
    var name: String,
    var username: String,
    var Repository: Int,
    var Follower: Int,
    var Following: Int,
    var company: String,
    var location: String
) : Parcelable