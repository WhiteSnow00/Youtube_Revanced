// 
// Decompiled by Procyon v0.6.0
// 

public enum ampl implements agzm
{
    a("BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN", 0, 0), 
    b("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END", 1, 1), 
    c("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START", 2, 7), 
    @Deprecated
    d("BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END", 3, 2), 
    @Deprecated
    e("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_GRAY", 4, 3), 
    @Deprecated
    f("BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_GRAY", 5, 4), 
    @Deprecated
    g("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_USE_DEFAULT_HEADER", 6, 5), 
    @Deprecated
    h("BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_USE_DEFAULT_HEADER", 7, 6), 
    @Deprecated
    i("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TITLE", 8, 8), 
    @Deprecated
    j("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TEXT", 9, 9), 
    @Deprecated
    k("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TITLE", 10, 10), 
    @Deprecated
    l("BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TEXT", 11, 11);
    
    private final int n;
    
    private ampl(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return amom.f;
    }
    
    public static ampl b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return ampl.l;
            }
            case 10: {
                return ampl.k;
            }
            case 9: {
                return ampl.j;
            }
            case 8: {
                return ampl.i;
            }
            case 7: {
                return ampl.c;
            }
            case 6: {
                return ampl.h;
            }
            case 5: {
                return ampl.g;
            }
            case 4: {
                return ampl.f;
            }
            case 3: {
                return ampl.e;
            }
            case 2: {
                return ampl.d;
            }
            case 1: {
                return ampl.b;
            }
            case 0: {
                return ampl.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
