// 
// Decompiled by Procyon v0.6.0
// 

public enum alwf implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("USER_AUTH", 1, 1), 
    c("VISITOR_ID", 2, 2), 
    d("PLUS_PAGE_ID", 3, 3), 
    e("SPATULA_V1", 4, 4), 
    f("SHERLOG_SESSION_ID", 5, 5), 
    g("EOM_VISITOR_ID", 6, 6);
    
    private static final alwf[] i;
    public final int h;
    
    private alwf(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return alua.l;
    }
    
    public static alwf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return alwf.g;
            }
            case 5: {
                return alwf.f;
            }
            case 4: {
                return alwf.e;
            }
            case 3: {
                return alwf.d;
            }
            case 2: {
                return alwf.c;
            }
            case 1: {
                return alwf.b;
            }
            case 0: {
                return alwf.a;
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
