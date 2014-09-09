/*
* Copyright (c) 2011-2013, ScalaFX Project
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
* * Redistributions of source code must retain the above copyright
* notice, this list of conditions and the following disclaimer.
* * Redistributions in binary form must reproduce the above copyright
* notice, this list of conditions and the following disclaimer in the
* documentation and/or other materials provided with the distribution.
* * Neither the name of the ScalaFX Project nor the
* names of its contributors may be used to endorse or promote products
* derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
* AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package hello


import javafx.util.Callback

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.collections.ObservableBuffer
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.{ListCell, ListView}
import scalafx.scene.effect.DropShadow
import scalafx.scene.image.ImageView
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{Color, Stops, LinearGradient}
import scalafx.scene.shape.Circle
import scalafx.scene.text.Text
object ScalaFXHelloWorld extends JFXApp {
  case class Person(firstName: String, lastName: String) {
    override def toString = firstName + " " + lastName
  }

  val characters = ObservableBuffer[Person](
    Person("Bungalow ", "Bill"),
    Person("Dennis", "O’Dell"),
    Person("Eleanor", "Rigby"),
    Person("Rocky", "Raccoon"),
    Person("Peggy", "Sue")
  )

  val factory = new Callback[ListView[String], ListCell[String]]() {
    def call(p1: ListView[String]): ListCell[String] = ???
  }

  val c = new ListCell[String]{

  }
//  {
//    item.onChange(
//      (_, _, _) =>
//        graphic = new Circle {fill = Color.BLUE; radius = 8}
//    )
//  }

  stage = new PrimaryStage {
    title = "ScalaFX Hello World1"
    scene = new Scene {
      fill = BLACK
      content = new ListView[String] {
        items = ObservableBuffer("Fifr", "Fufr")
        cellFactory = { _ => new ListCell[String]{
            item.onChange{
              (_, _, newValue) => {
                graphic = new ImageView("https://avatars1.githubusercontent.com/u/564449?v=2&s=40"){
                  fitWidth = 12f
                  fitHeight = 12f
                }
                text = newValue
              }
            }
          }
        }
      }
    }
  }
}