// 
// Decompiled by Procyon v0.6.0
// 

public enum alyx implements ahbl
{
    a("GENERATION_STATUS_UNKNOWN", 0, 0), 
    b("GENERATION_STATUS_DONE", 1, 1);
    
    private static final alyx[] d;
    public final int c;
    
    private alyx(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static ahbn a() {
        return alyw.a;
    }
    
    public static alyx b(final int n) {
        if (n == 0) {
            return alyx.a;
        }
        if (n != 1) {
            return null;
        }
        return alyx.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
