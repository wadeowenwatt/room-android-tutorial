package wade.owen.watt.room_tutorial

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null, // Room auto generates the ID
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
)
