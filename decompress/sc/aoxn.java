// 
// Decompiled by Procyon v0.6.0
// 

public enum aoxn
{
    a("TASK_REGISTERED", 0, 1), 
    b("CLOCK_TIME", 1, 2), 
    c("EVENT_NOT_SET", 2, 0);
    
    private static final aoxn[] e;
    public final int d;
    
    private aoxn(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static aoxn a(final int n) {
        if (n == 0) {
            return aoxn.c;
        }
        if (n == 1) {
            return aoxn.a;
        }
        if (n != 2) {
            return null;
        }
        return aoxn.b;
    }
}
