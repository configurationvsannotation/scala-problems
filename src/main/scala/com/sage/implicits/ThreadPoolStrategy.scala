package com.sage.implicits

import java.util.concurrent.{Callable, Executors}

object ThreadPoolStrategy extends ThreadStrategy {
  val pool = Executors.newFixedThreadPool(
    java.lang.Runtime.getRuntime.availableProcessors)
  def execute[A](func : Function0[A] ) = {
    val future = pool.submit(new Callable[A] {
      def call() : A = {
        Console.println("Executing function on thread: " +
          Thread.currentThread.getName)
        func()
      }
    })
    () => future.get()
  }
}
