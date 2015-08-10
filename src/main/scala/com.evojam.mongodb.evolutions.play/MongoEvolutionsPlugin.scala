package com.evojam.mongodb.evolutions.play

import play.api.{Application, Plugin}

import com.evojam.mongodb.evolutions.MongoEvolutions

class MongoEvolutionsPlugin(app: Application) extends Plugin {
  override def onStart() {
    new MongoEvolutions()
      .applyEvolutions()
  }
}
