package StringIQ.StringBufferAndString;

public class StringBufferAndStringBuilder {
    /**
     * not immutable
     * strbuffer is trying to be synchronized
     * Stringbuilder is not trying to synchronized which means, strbuilder is faster than strbuffer
     *
     */

    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("");
                      StringBuilder strBuilder = new StringBuilder("");

        //immutable

        String strString = new String("");
        int a = 1000;

        long exeStartTime = System.currentTimeMillis();
       // System.out.println(exeStartTime);
        for (int i = 0; i < a; i++) {
          strBuffer =  strBuffer.append("a");
            //System.out.println(strBuffer);

        }
        long exeEndTime = System.currentTimeMillis();
      //  System.out.println(exeEndTime);
        long bufferTotalExutiontime = exeEndTime - exeStartTime;
        System.out.println("bufferTotalExutiontime = " + bufferTotalExutiontime);
       /////////////////////////////////////////////////
      Long startBuild= System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strBuilder.append(i);
           // System.out.println(strBuilder);
        }

        Long builderEndTime = System.currentTimeMillis();
        long builderTotalExcutionTime = builderEndTime - startBuild;
        System.out.println("builderTotalExcutionTime = " + builderTotalExcutionTime);
//////////
        Long strStartTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strString +=i;
            //System.out.println(strString);
        }
        Long strEndTimeExcution = System.currentTimeMillis();
        Long strTotalExcutionTime = strEndTimeExcution - strStartTime;
        System.out.println("strTotalExcutionTime = " + strTotalExcutionTime);
    }
}
