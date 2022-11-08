// 
// Decompiled by Procyon v0.6.0
// 

public enum aorg implements agzm
{
    a("THUMBNAIL_SELECTION_UNKNOWN", 0, 0), 
    b("THUMBNAIL_SELECTION_AUTOGEN_1", 1, 1), 
    c("THUMBNAIL_SELECTION_AUTOGEN_2", 2, 2), 
    d("THUMBNAIL_SELECTION_AUTOGEN_3", 3, 3), 
    e("THUMBNAIL_SELECTION_EXISTING_CUSTOM_THUMBNAIL", 4, 4), 
    f("THUMBNAIL_SELECTION_NEW_CUSTOM_THUMBNAIL", 5, 5);
    
    public final int g;
    
    private aorg(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agzo a() {
        return aonj.q;
    }
    
    public static aorg b(final int n) {
        if (n == 0) {
            return aorg.a;
        }
        if (n == 1) {
            return aorg.b;
        }
        if (n == 2) {
            return aorg.c;
        }
        if (n == 3) {
            return aorg.d;
        }
        if (n == 4) {
            return aorg.e;
        }
        if (n != 5) {
            return null;
        }
        return aorg.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
