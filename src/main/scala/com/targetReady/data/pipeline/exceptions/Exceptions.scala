package com.targetReady.data.pipeline.exceptions

class exceptions(massage: String, cause: Throwable) extends Exception(massage, cause) {
  def this(massage: String) = this(massage, None.orNull)
}

case class FileReaderException(message: String) extends exceptions(message)

case class FileWriterException(message: String) extends exceptions(message)

case class SparkSessionException(message: String) extends exceptions(message)

case class DqNullCheckException(message: String) extends exceptions(message)

case class DqDuplicateCheckException(message: String) extends exceptions(message)