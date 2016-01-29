package com.evojam.mongodb.evolutions.play

import com.google.inject.Inject

import com.evojam.mongodb.evolutions.{MongoEvolutions => MongoEvolutionsScala}

trait MongoEvolutions

private[play] class MongoEvolutionsImpl @Inject() () extends MongoEvolutions {
  new MongoEvolutionsScala()
    .applyEvolutions()
}
