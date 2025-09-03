package kotlin_base.myFile

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.regex.Pattern

fun main() {
    val directory = File("D:\\WorkSpace\\FileTest\\jpegs")
//        File directory2 = new File("D:\\WorkSpace\\FileTest\\jpegs2");
    //        File directory2 = new File("D:\\WorkSpace\\FileTest\\jpegs2");
    val files = directory.listFiles() ?: throw NoSuchElementException()

    for (file in files) {
        println(file.name)
    }
    val pattern = Pattern.compile("^0(\\((\\d+)\\))?")

    val files1 = arrayOfNulls<File>(files.size)
    for (file in files) {
        val name = file.name
        val matcher = pattern.matcher(name)
        if (matcher.find()) {
            var index = -1
            val group = matcher.group(2)
            index = group?.toInt() ?: 0
            if (index < 0) {
                println("group error: $name")
                continue
            }
            if (files1[index] != null) {
                println("group has: $name")
                continue
            }
            files1[index] = file
        }
    }

    for ((i,file) in files1.withIndex()) {
        if (file == null)
            continue;
        val inputStream = FileInputStream(file)
        val fileOutputStream = FileOutputStream("D:\\WorkSpace\\FileTest\\jpegs2" + File.separator + i + ".jpg")
        inputStream.copyTo(fileOutputStream)
        fileOutputStream.flush()
        fileOutputStream.close()
        inputStream.close()
    }
}