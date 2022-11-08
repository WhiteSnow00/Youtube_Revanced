// 
// Decompiled by Procyon v0.6.0
// 

public enum apje implements agzm
{
    a("EFFECT_SUBPACKAGE_ID_UNSPECIFIED", 0, 0), 
    b("EFFECT_SUBPACKAGE_ID_EXPRESSIVE", 1, 1), 
    c("EFFECT_SUBPACKAGE_ID_PRESET", 2, 2);
    
    public final int d;
    
    private apje(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return apjd.a;
    }
    
    public static apje b(final int n) {
        if (n == 0) {
            return apje.a;
        }
        if (n == 1) {
            return apje.b;
        }
        if (n != 2) {
            return null;
        }
        return apje.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
