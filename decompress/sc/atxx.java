// 
// Decompiled by Procyon v0.6.0
// 

public enum atxx implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("CRONET", 1, 1);
    
    private static final atxx[] d;
    public final int c;
    
    private atxx(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static ahbn a() {
        return areg.j;
    }
    
    public static atxx b(final int n) {
        if (n == 0) {
            return atxx.a;
        }
        if (n != 1) {
            return null;
        }
        return atxx.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
