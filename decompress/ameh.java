// 
// Decompiled by Procyon v0.6.0
// 

public enum ameh implements ahbl
{
    a("DAY_OF_WEEK_UNKNOWN", 0, 0), 
    b("DAY_OF_WEEK_SUNDAY", 1, 1), 
    c("DAY_OF_WEEK_MONDAY", 2, 2), 
    d("DAY_OF_WEEK_TUESDAY", 3, 3), 
    e("DAY_OF_WEEK_WEDNESDAY", 4, 4), 
    f("DAY_OF_WEEK_THURSDAY", 5, 5), 
    g("DAY_OF_WEEK_FRIDAY", 6, 6), 
    h("DAY_OF_WEEK_SATURDAY", 7, 7);
    
    private static final ameh[] i;
    private final int j;
    
    private ameh(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahbn a() {
        return alyw.f;
    }
    
    public static ameh b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return ameh.h;
            }
            case 6: {
                return ameh.g;
            }
            case 5: {
                return ameh.f;
            }
            case 4: {
                return ameh.e;
            }
            case 3: {
                return ameh.d;
            }
            case 2: {
                return ameh.c;
            }
            case 1: {
                return ameh.b;
            }
            case 0: {
                return ameh.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
