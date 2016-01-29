package com.evojam.mongodb.evolutions.play

import play.api.{Configuration, Environment}
import play.api.inject.{Binding, Module}

class MongoEvolutionsModule extends Module {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] =
    Seq(
      bind[MongoEvolutions].to[MongoEvolutionsImpl].eagerly()
    )
}
