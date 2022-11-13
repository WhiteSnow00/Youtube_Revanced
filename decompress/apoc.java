// 
// Decompiled by Procyon v0.6.0
// 

public enum apoc implements ahbl
{
    a("VIDEO_QUALITY_SETTING_UNKNOWN", 0, 0), 
    b("VIDEO_QUALITY_SETTING_HIGHER_QUALITY", 1, 1), 
    c("VIDEO_QUALITY_SETTING_DATA_SAVER", 2, 2), 
    d("VIDEO_QUALITY_SETTING_ADVANCED_MENU", 3, 3);
    
    private static final apoc[] f;
    public final int e;
    
    private apoc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aplg.o;
    }
    
    public static apoc b(final int n) {
        if (n == 0) {
            return apoc.a;
        }
        if (n == 1) {
            return apoc.b;
        }
        if (n == 2) {
            return apoc.c;
        }
        if (n != 3) {
            return null;
        }
        return apoc.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
