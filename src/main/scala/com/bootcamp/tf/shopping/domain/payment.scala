package com.bootcamp.tf.shopping.domain

import com.bootcamp.tf.shopping.domain.card.Card
import com.bootcamp.tf.shopping.domain.money.Money
import com.bootcamp.tf.shopping.domain.user.UserId
import io.circe.generic.JsonCodec

object payment {

  @JsonCodec
  final case class PaymentId(value: String)

  final case class Payment(userId: UserId, amount: Money, card: Card)

}
