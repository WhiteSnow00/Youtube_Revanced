// 
// Decompiled by Procyon v0.6.0
// 

public enum alws implements agzm
{
    a("GENERATION_STATUS_UNKNOWN", 0, 0), 
    b("GENERATION_STATUS_DONE", 1, 1);
    
    public final int c;
    
    private alws(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static agzo a() {
        return alyk.b;
    }
    
    public static alws b(final int n) {
        if (n == 0) {
            return alws.a;
        }
        if (n != 1) {
            return null;
        }
        return alws.b;
    }
    
    @Override
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
