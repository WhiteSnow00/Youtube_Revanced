// 
// Decompiled by Procyon v0.6.0
// 

public enum aipw implements ahbl
{
    a("CODEC_REUSE_MODE_UNKNOWN", 0, 0), 
    b("CODEC_REUSE_MODE_REUSE", 1, 1), 
    @Deprecated
    c("CODEC_REUSE_MODE_REUSE_WITH_CONFIGURE", 2, 2), 
    @Deprecated
    d("CODEC_REUSE_MODE_REUSE_WITH_STOP_AND_CONFIGURE", 3, 3), 
    e("CODEC_REUSE_MODE_REUSE_WITH_RECONFIGURATION", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final aipw[] g;
    private final int h;
    
    private aipw(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return aill.m;
    }
    
    public static aipw b(final int n) {
        if (n == 0) {
            return aipw.a;
        }
        if (n == 1) {
            return aipw.b;
        }
        if (n == 2) {
            return aipw.c;
        }
        if (n == 3) {
            return aipw.d;
        }
        if (n != 4) {
            return null;
        }
        return aipw.e;
    }
    
    public final int getNumber() {
        if (this != aipw.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
