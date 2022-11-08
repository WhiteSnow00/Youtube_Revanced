// 
// Decompiled by Procyon v0.6.0
// 

public enum amcd implements agzm
{
    a("DAY_OF_WEEK_UNKNOWN", 0, 0), 
    b("DAY_OF_WEEK_SUNDAY", 1, 1), 
    c("DAY_OF_WEEK_MONDAY", 2, 2), 
    d("DAY_OF_WEEK_TUESDAY", 3, 3), 
    e("DAY_OF_WEEK_WEDNESDAY", 4, 4), 
    f("DAY_OF_WEEK_THURSDAY", 5, 5), 
    g("DAY_OF_WEEK_FRIDAY", 6, 6), 
    h("DAY_OF_WEEK_SATURDAY", 7, 7);
    
    private final int j;
    
    private amcd(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static agzo a() {
        return alyk.e;
    }
    
    public static amcd b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return amcd.h;
            }
            case 6: {
                return amcd.g;
            }
            case 5: {
                return amcd.f;
            }
            case 4: {
                return amcd.e;
            }
            case 3: {
                return amcd.d;
            }
            case 2: {
                return amcd.c;
            }
            case 1: {
                return amcd.b;
            }
            case 0: {
                return amcd.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
