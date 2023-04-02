package  multimodular_project_RITIK_KURIL

import Module1.hello

object Module2 {
  def main(args: Array[String]): Unit = {
    println(Module1.hello())
    println("Hello from module 2!")
  }
}