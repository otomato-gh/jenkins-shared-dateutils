def call(format)
{
   supported_formats = ["ddmmyy", "mmddyy"]
   if (!supported_formats.contains(format)) {
      println "Unsupported format $format"
      return 1
   }
   println format.getClass()
   d = new Date()
   return Date.format(format.toString())
 }  
