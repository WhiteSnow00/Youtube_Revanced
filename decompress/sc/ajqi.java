// 
// Decompiled by Procyon v0.6.0
// 

public enum ajqi implements ahbl
{
    a("DRM_TRACK_TYPE_UNSPECIFIED", 0, 0), 
    b("DRM_TRACK_TYPE_AUDIO", 1, 1), 
    c("DRM_TRACK_TYPE_SD", 2, 2), 
    d("DRM_TRACK_TYPE_HD", 3, 3), 
    e("DRM_TRACK_TYPE_UHD1", 4, 4), 
    f("DRM_TRACK_TYPE_UHD2", 5, 5);
    
    private static final ajqi[] h;
    public final int g;
    
    private ajqi(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return ajqf.e;
    }
    
    public static ajqi b(final int n) {
        if (n == 0) {
            return ajqi.a;
        }
        if (n == 1) {
            return ajqi.b;
        }
        if (n == 2) {
            return ajqi.c;
        }
        if (n == 3) {
            return ajqi.d;
        }
        if (n == 4) {
            return ajqi.e;
        }
        if (n != 5) {
            return null;
        }
        return ajqi.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
