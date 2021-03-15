import react.dom.*
import kotlinx.browser.document
import kotlinx.css.Color
import kotlinx.css.FontStyle
import kotlinx.css.color
import kotlinx.css.fontFamily
import styled.css
import styled.styledH1

fun main() {

    val unwatchedVideos = listOf(
        KotlinVideo(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
        KotlinVideo(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
        KotlinVideo(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
    )

    val watchedVideos = listOf(
        KotlinVideo(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
    )

    render(document.getElementById("root")) {
        styledH1 {
            css {
                color = Color.darkMagenta;
                fontFamily = "sans-serif"
            }
            + "KotlinConf Explorer"
        }
        div {
            h3 {
                + "Videos to watch"
            }
            for (video in unwatchedVideos)
                p {
                    + "${video.speaker} : ${video.title}"
                }
            h3 {
                + "Videos watched"
            }
            for (video in watchedVideos)
                p {
                    + "${video.speaker} : ${video.title}"
                }
        }
        div {
            h3 {
                + "John Doe: Building and breaking things"
            }
            img {
              attrs {
                  src ="https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
              }
            }
        }
    }
}