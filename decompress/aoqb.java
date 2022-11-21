// 
// Decompiled by Procyon v0.6.0
// 

public enum aoqb implements ahdd
{
    a("SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN", 0, 0), 
    b("SUGGEST_EDITABLE_TEXT_ACTION_INSERT", 1, 1), 
    c("SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE", 2, 2), 
    d("SUGGEST_EDITABLE_TEXT_ACTION_CHANGE", 3, 3), 
    e("SUGGEST_EDITABLE_TEXT_ACTION_KEYBOARD_DOWN", 4, 4);
    
    private static final aoqb[] f;
    private final int g;
    
    private aoqb(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return aonf.l;
    }
    
    public static aoqb b(final int n) {
        if (n == 0) {
            return aoqb.a;
        }
        if (n == 1) {
            return aoqb.b;
        }
        if (n == 2) {
            return aoqb.c;
        }
        if (n == 3) {
            return aoqb.d;
        }
        if (n != 4) {
            return null;
        }
        return aoqb.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
