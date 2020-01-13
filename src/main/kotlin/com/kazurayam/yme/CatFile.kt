package com.kazurayam.yme

import java.io.File
import kotlin.system.exitProcess

class CatFile {
    init {}
    private fun writeSkippingHeader(outbuf: CharArray, size: Int, n: Int, fout: File): Int {
        return 0
    }
    private fun decompress(fin: File, fout: File): Unit {}

    fun usage() {
        System.err.println("Usage:¥n")
        System.err.println("  CatFile <blob_file>¥n")
    }

    fun main(args: Array<String>) {
        val fin: File
        if (args.size == 1) {
            usage()
            exitProcess(1)
        }
        
    }
}