// 
// Decompiled by Procyon v0.6.0
// 

public enum aply implements agzm
{
    a("VIDEO_QUALITY_SETTING_UNKNOWN", 0, 0), 
    b("VIDEO_QUALITY_SETTING_HIGHER_QUALITY", 1, 1), 
    c("VIDEO_QUALITY_SETTING_DATA_SAVER", 2, 2), 
    d("VIDEO_QUALITY_SETTING_ADVANCED_MENU", 3, 3);
    
    public final int e;
    
    private aply(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return apjd.n;
    }
    
    public static aply b(final int n) {
        if (n == 0) {
            return aply.a;
        }
        if (n == 1) {
            return aply.b;
        }
        if (n == 2) {
            return aply.c;
        }
        if (n != 3) {
            return null;
        }
        return aply.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
