// 
// Decompiled by Procyon v0.6.0
// 

public enum atwe implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("FOREGROUND_TO_BACKGROUND", 1, 1), 
    c("BACKGROUND_TO_FOREGROUND", 2, 2), 
    d("FOREGROUND_SERVICE_START", 3, 3), 
    e("FOREGROUND_SERVICE_STOP", 4, 4), 
    f("CUSTOM_MEASURE_START", 5, 5), 
    g("CUSTOM_MEASURE_STOP", 6, 6);
    
    public final int h;
    
    private atwe(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return arbt.e;
    }
    
    public static atwe b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return atwe.g;
            }
            case 5: {
                return atwe.f;
            }
            case 4: {
                return atwe.e;
            }
            case 3: {
                return atwe.d;
            }
            case 2: {
                return atwe.c;
            }
            case 1: {
                return atwe.b;
            }
            case 0: {
                return atwe.a;
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
