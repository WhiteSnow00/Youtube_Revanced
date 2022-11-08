// 
// Decompiled by Procyon v0.6.0
// 

public enum lpp implements agzm
{
    a("TRACK_TYPE_AUDIO", 0, 1), 
    b("TRACK_TYPE_VIDEO", 1, 2), 
    c("TRACK_TYPE_TEXT", 2, 4);
    
    public final int d;
    
    private lpp(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static lpp a(final int n) {
        if (n == 1) {
            return lpp.a;
        }
        if (n == 2) {
            return lpp.b;
        }
        if (n != 4) {
            return null;
        }
        return lpp.c;
    }
    
    public static agzo b() {
        return ehk.p;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
