// 
// Decompiled by Procyon v0.6.0
// 

public enum aijx implements ahdd
{
    a("CHANNEL_STATUS_UNKNOWN", 0, 0), 
    b("CHANNEL_STATUS_UNREAD", 1, 1), 
    c("CHANNEL_STATUS_LIVE", 2, 2);
    
    private static final aijx[] e;
    public final int d;
    
    private aijx(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aiga.n;
    }
    
    public static aijx b(final int n) {
        if (n == 0) {
            return aijx.a;
        }
        if (n == 1) {
            return aijx.b;
        }
        if (n != 2) {
            return null;
        }
        return aijx.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
