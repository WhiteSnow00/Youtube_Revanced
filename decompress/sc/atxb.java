// 
// Decompiled by Procyon v0.6.0
// 

public enum atxb implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("FOREGROUND_TO_BACKGROUND", 1, 1), 
    c("BACKGROUND_TO_FOREGROUND", 2, 2), 
    d("FOREGROUND_SERVICE_START", 3, 3), 
    e("FOREGROUND_SERVICE_STOP", 4, 4), 
    f("CUSTOM_MEASURE_START", 5, 5), 
    g("CUSTOM_MEASURE_STOP", 6, 6);
    
    private static final atxb[] i;
    public final int h;
    
    private atxb(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return areg.f;
    }
    
    public static atxb b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return atxb.g;
            }
            case 5: {
                return atxb.f;
            }
            case 4: {
                return atxb.e;
            }
            case 3: {
                return atxb.d;
            }
            case 2: {
                return atxb.c;
            }
            case 1: {
                return atxb.b;
            }
            case 0: {
                return atxb.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
