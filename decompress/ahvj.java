// 
// Decompiled by Procyon v0.6.0
// 

public enum ahvj implements ahdd
{
    a("ICON_IMAGE_STYLE_DEFAULT", 0, 0), 
    b("ICON_IMAGE_STYLE_SCALE", 1, 1), 
    c("ICON_IMAGE_STYLE_CROP", 2, 2), 
    d("ICON_IMAGE_STYLE_UNCHANGED", 3, 3);
    
    private static final ahvj[] e;
    private final int f;
    
    private ahvj(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ahqv.u;
    }
    
    public static ahvj b(final int n) {
        if (n == 0) {
            return ahvj.a;
        }
        if (n == 1) {
            return ahvj.b;
        }
        if (n == 2) {
            return ahvj.c;
        }
        if (n != 3) {
            return null;
        }
        return ahvj.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
