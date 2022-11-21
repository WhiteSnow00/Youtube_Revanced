// 
// Decompiled by Procyon v0.6.0
// 

public enum aiiu implements ahdd
{
    a("CHANNEL_EDITABLE_TEXT_FIELD_MODE_UNKNOWN", 0, 0), 
    b("CHANNEL_EDITABLE_TEXT_FIELD_MODE_EDIT", 1, 1), 
    c("CHANNEL_EDITABLE_TEXT_FIELD_MODE_EDIT_DISABLED", 2, 2), 
    d("CHANNEL_EDITABLE_TEXT_FIELD_MODE_COPY", 3, 3);
    
    private static final aiiu[] e;
    private final int f;
    
    private aiiu(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aiga.h;
    }
    
    public static aiiu b(final int n) {
        if (n == 0) {
            return aiiu.a;
        }
        if (n == 1) {
            return aiiu.b;
        }
        if (n == 2) {
            return aiiu.c;
        }
        if (n != 3) {
            return null;
        }
        return aiiu.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
