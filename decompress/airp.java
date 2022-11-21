// 
// Decompiled by Procyon v0.6.0
// 

public enum airp implements ahdd
{
    a("CODEC_REUSE_MODE_UNKNOWN", 0, 0), 
    b("CODEC_REUSE_MODE_REUSE", 1, 1), 
    @Deprecated
    c("CODEC_REUSE_MODE_REUSE_WITH_CONFIGURE", 2, 2), 
    @Deprecated
    d("CODEC_REUSE_MODE_REUSE_WITH_STOP_AND_CONFIGURE", 3, 3), 
    e("CODEC_REUSE_MODE_REUSE_WITH_RECONFIGURATION", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final airp[] g;
    private final int h;
    
    private airp(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return aine.m;
    }
    
    public static airp b(final int n) {
        if (n == 0) {
            return airp.a;
        }
        if (n == 1) {
            return airp.b;
        }
        if (n == 2) {
            return airp.c;
        }
        if (n == 3) {
            return airp.d;
        }
        if (n != 4) {
            return null;
        }
        return airp.e;
    }
    
    public final int getNumber() {
        if (this != airp.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
