package com.mobitel.advancedjetpack.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UIScreenInterests(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        UIScreenFlowRow(movieList())
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun UIScreenFlowRow(list : List<String>){
    FlowRow {
        list.forEach { 
            Text(text = it, modifier = Modifier.padding(10.dp))
        }
    }

}

fun movieList(): List<String> {
    return listOf(
        "Inception", "The Shawshank Redemption", "The Dark Knight", "Forrest Gump", "Interstellar",
        "The Godfather", "Pulp Fiction", "Fight Club", "The Matrix", "The Lord of the Rings: The Return of the King",
        "The Empire Strikes Back", "Gladiator", "Titanic", "Schindler's List", "The Silence of the Lambs",
        "Saving Private Ryan", "Avatar", "The Avengers", "Joker", "Spider-Man: No Way Home",
        "Avengers: Endgame", "Black Panther", "Parasite", "Whiplash", "The Wolf of Wall Street",
        "Django Unchained", "Goodfellas", "The Green Mile", "Toy Story", "Finding Nemo",
        "Up", "The Lion King", "Coco", "Frozen", "Beauty and the Beast",
        "Aladdin", "Moana", "Encanto", "Shrek", "Kung Fu Panda",
        "Madagascar", "Despicable Me", "The Incredibles", "Monsters, Inc.", "Ratatouille",
        "WALL-E", "Inside Out", "Zootopia", "The Secret Life of Pets", "How to Train Your Dragon",
        "Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets",
        "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
        "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
        "Harry Potter and the Deathly Hallows: Part 1", "Harry Potter and the Deathly Hallows: Part 2",
        "Fantastic Beasts and Where to Find Them", "The Crimes of Grindelwald",
        "The Secrets of Dumbledore", "Twilight", "New Moon",
        "Eclipse", "Breaking Dawn: Part 1", "Breaking Dawn: Part 2",
        "The Hunger Games", "Catching Fire", "Mockingjay: Part 1", "Mockingjay: Part 2",
        "Divergent", "Insurgent", "Allegiant", "The Maze Runner",
        "The Scorch Trials", "The Death Cure", "The Fault in Our Stars",
        "To All the Boys I've Loved Before", "P.S. I Still Love You",
        "Always and Forever", "The Kissing Booth", "The Kissing Booth 2",
        "The Kissing Booth 3", "Crazy Rich Asians", "The Proposal",
        "Friends with Benefits", "No Strings Attached", "50 First Dates",
        "10 Things I Hate About You", "Notting Hill", "Love Actually",
        "The Holiday", "Bridget Jones's Diary", "Mamma Mia!", "Pitch Perfect"
    )
}