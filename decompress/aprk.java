// 
// Decompiled by Procyon v0.6.0
// 

public enum aprk implements ahdd
{
    a("VOLUME_TYPE_UNKNOWN", 0, 0), 
    b("VOLUME_TYPE_ORIGINAL", 1, 1), 
    c("VOLUME_TYPE_ADDED_MUSIC", 2, 2), 
    d("VOLUME_TYPE_VOICEOVER", 3, 3), 
    e("VOLUME_TYPE_GREEN_SCREEN", 4, 4);
    
    private static final aprk[] g;
    public final int f;
    
    private aprk(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aprh.j;
    }
    
    public static aprk b(final int n) {
        if (n == 0) {
            return aprk.a;
        }
        if (n == 1) {
            return aprk.b;
        }
        if (n == 2) {
            return aprk.c;
        }
        if (n == 3) {
            return aprk.d;
        }
        if (n != 4) {
            return null;
        }
        return aprk.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
