// 
// Decompiled by Procyon v0.6.0
// 

public enum apqo implements ahdd
{
    a("VIDEO_QUALITY_SETTING_UNKNOWN", 0, 0), 
    b("VIDEO_QUALITY_SETTING_HIGHER_QUALITY", 1, 1), 
    c("VIDEO_QUALITY_SETTING_DATA_SAVER", 2, 2), 
    d("VIDEO_QUALITY_SETTING_ADVANCED_MENU", 3, 3);
    
    private static final apqo[] f;
    public final int e;
    
    private apqo(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return apnc.p;
    }
    
    public static apqo b(final int n) {
        if (n == 0) {
            return apqo.a;
        }
        if (n == 1) {
            return apqo.b;
        }
        if (n == 2) {
            return apqo.c;
        }
        if (n != 3) {
            return null;
        }
        return apqo.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
