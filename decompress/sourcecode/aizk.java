// 
// Decompiled by Procyon v0.6.0
// 

public enum aizk
{
    a("COMMAND", 0), 
    b("EMBARGO", 1), 
    c("ACTION_NOT_SET", 2);
    
    private aizk(final String s, final int n) {
    }
    
    public static aizk a(final int n) {
        if (n == 0) {
            return aizk.c;
        }
        if (n == 1) {
            return aizk.a;
        }
        if (n != 2) {
            return null;
        }
        return aizk.b;
    }
}
