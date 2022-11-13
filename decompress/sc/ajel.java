// 
// Decompiled by Procyon v0.6.0
// 

public enum ajel implements ahbl
{
    a("DEVICE_ORIENTATION_UNKNOWN", 0, 0), 
    b("DEVICE_ORIENTATION_PORTRAIT", 1, 1), 
    c("DEVICE_ORIENTATION_PORTRAIT_UPSIDE_DOWN", 2, 2), 
    d("DEVICE_ORIENTATION_LANDSCAPE_LEFT", 3, 3), 
    e("DEVICE_ORIENTATION_LANDSCAPE_RIGHT", 4, 4), 
    f("DEVICE_ORIENTATION_LANDSCAPE", 5, 5), 
    g("DEVICE_ORIENTATION_SQUARE", 6, 6);
    
    private static final ajel[] i;
    public final int h;
    
    private ajel(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return ajek.a;
    }
    
    public static ajel b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ajel.g;
            }
            case 5: {
                return ajel.f;
            }
            case 4: {
                return ajel.e;
            }
            case 3: {
                return ajel.d;
            }
            case 2: {
                return ajel.c;
            }
            case 1: {
                return ajel.b;
            }
            case 0: {
                return ajel.a;
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
