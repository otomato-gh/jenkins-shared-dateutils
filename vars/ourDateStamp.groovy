def call(format)
{
   supported_formats = ["ddmmyy", "mmddyy"]
   if !formats.contains(format) {
      println "Unspported format $format"
      return 1
   }
   d = new Date()
   return Date.format(format)
 }  