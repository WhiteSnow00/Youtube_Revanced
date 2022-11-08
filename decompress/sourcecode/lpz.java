// 
// Decompiled by Procyon v0.6.0
// 

public enum lpz implements agzm
{
    a("AUDIO_ROUTE_UNSPECIFIED", 0, 0), 
    b("AUDIO_ROUTE_MUSIC", 1, 1), 
    c("AUDIO_ROUTE_ALARM", 2, 2);
    
    public final int d;
    
    private lpz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static lpz a(final int n) {
        if (n == 0) {
            return lpz.a;
        }
        if (n == 1) {
            return lpz.b;
        }
        if (n != 2) {
            return null;
        }
        return lpz.c;
    }
    
    public static agzo b() {
        return ehk.q;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
