// 
// Decompiled by Procyon v0.6.0
// 

public enum akzh implements ahbl
{
    a("INPUT_METHOD_UNKNOWN", 0, 0), 
    b("KEYBOARD", 1, 1), 
    c("PASTE", 2, 2), 
    d("ON_SCREEN_KEYBOARD", 3, 3), 
    e("IME", 4, 4), 
    f("QUERY_BUILDER", 5, 5), 
    g("SPEECH", 6, 6), 
    h("HANDWRITING", 7, 7), 
    i("TAB", 8, 8), 
    j("GESTURE_DECODING_DYM_QUERY_BUILDER", 9, 9);
    
    private static final akzh[] l;
    public final int k;
    
    private akzh(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static ahbn a() {
        return akwi.e;
    }
    
    public static akzh b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return akzh.j;
            }
            case 8: {
                return akzh.i;
            }
            case 7: {
                return akzh.h;
            }
            case 6: {
                return akzh.g;
            }
            case 5: {
                return akzh.f;
            }
            case 4: {
                return akzh.e;
            }
            case 3: {
                return akzh.d;
            }
            case 2: {
                return akzh.c;
            }
            case 1: {
                return akzh.b;
            }
            case 0: {
                return akzh.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
