// 
// Decompiled by Procyon v0.6.0
// 

public enum apmu implements agzm
{
    a("VOLUME_TYPE_UNKNOWN", 0, 0), 
    b("VOLUME_TYPE_ORIGINAL", 1, 1), 
    c("VOLUME_TYPE_ADDED_MUSIC", 2, 2), 
    d("VOLUME_TYPE_VOICEOVER", 3, 3), 
    e("VOLUME_TYPE_GREEN_SCREEN", 4, 4);
    
    public final int f;
    
    private apmu(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return apms.h;
    }
    
    public static apmu b(final int n) {
        if (n == 0) {
            return apmu.a;
        }
        if (n == 1) {
            return apmu.b;
        }
        if (n == 2) {
            return apmu.c;
        }
        if (n == 3) {
            return apmu.d;
        }
        if (n != 4) {
            return null;
        }
        return apmu.e;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
