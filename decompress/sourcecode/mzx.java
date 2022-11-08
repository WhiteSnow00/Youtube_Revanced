// 
// Decompiled by Procyon v0.6.0
// 

final class mzx
{
    public static String a(String s) {
        final String s2 = "";
        try {
            final Object l = nan.l("get", mnb.i(s), mnb.i(""));
            if (l == null) {
                s = s2;
            }
            else {
                s = (String)l;
            }
            return s;
        }
        catch (final ReflectiveOperationException ex) {
            s = s2;
            return s;
        }
    }
    
    public static int b() {
        final int n = -1;
        try {
            final Object l = nan.l("getInt", mnb.i("ro.boot.flash.locked"), new mnb((Class)Integer.TYPE, (Object)(-1)));
            int intValue;
            if (l == null) {
                intValue = n;
            }
            else {
                intValue = (int)l;
            }
            return intValue;
        }
        catch (final ReflectiveOperationException ex) {
            return n;
        }
    }
}
