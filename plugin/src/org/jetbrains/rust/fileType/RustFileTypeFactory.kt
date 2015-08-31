package org.jetbrains.rust.fileType

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory


public class RustFileTypeFactory() : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(RustFileType.INSTANCE, RustFileType.DEFAULT_EXTENSION)
    }
}