// 
// Decompiled by Procyon v0.6.0
// 

public enum apoy implements ahbl
{
    a("VOLUME_TYPE_UNKNOWN", 0, 0), 
    b("VOLUME_TYPE_ORIGINAL", 1, 1), 
    c("VOLUME_TYPE_ADDED_MUSIC", 2, 2), 
    d("VOLUME_TYPE_VOICEOVER", 3, 3), 
    e("VOLUME_TYPE_GREEN_SCREEN", 4, 4);
    
    private static final apoy[] g;
    public final int f;
    
    private apoy(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return apow.i;
    }
    
    public static apoy b(final int n) {
        if (n == 0) {
            return apoy.a;
        }
        if (n == 1) {
            return apoy.b;
        }
        if (n == 2) {
            return apoy.c;
        }
        if (n == 3) {
            return apoy.d;
        }
        if (n != 4) {
            return null;
        }
        return apoy.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
