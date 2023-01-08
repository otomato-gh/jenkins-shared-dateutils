def call(format)
{
   supported_formats = ["ddmmyy", "mmddyy"]
   if (!supported_formats.contains(format)) {
      println "Unsupported format $format"
      return 1
   }
   println format.getClass()
   return new Date().format(format)
 }  
