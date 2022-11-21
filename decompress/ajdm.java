// 
// Decompiled by Procyon v0.6.0
// 

public enum ajdm
{
    a("COMMAND", 0), 
    b("EMBARGO", 1), 
    c("ACTION_NOT_SET", 2);
    
    private static final ajdm[] d;
    
    private ajdm(final String s, final int n) {
    }
    
    public static ajdm a(final int n) {
        if (n == 0) {
            return ajdm.c;
        }
        if (n == 1) {
            return ajdm.a;
        }
        if (n != 2) {
            return null;
        }
        return ajdm.b;
    }
}
