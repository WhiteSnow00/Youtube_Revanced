// 
// Decompiled by Procyon v0.6.0
// 

public enum aovk
{
    a("TASK_REGISTERED", 0, 1), 
    b("CLOCK_TIME", 1, 2), 
    c("EVENT_NOT_SET", 2, 0);
    
    public final int d;
    
    private aovk(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static aovk a(final int n) {
        if (n == 0) {
            return aovk.c;
        }
        if (n == 1) {
            return aovk.a;
        }
        if (n != 2) {
            return null;
        }
        return aovk.b;
    }
}
