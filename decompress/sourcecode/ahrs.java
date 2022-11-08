// 
// Decompiled by Procyon v0.6.0
// 

public enum ahrs implements agzm
{
    a("ICON_IMAGE_STYLE_DEFAULT", 0, 0), 
    b("ICON_IMAGE_STYLE_SCALE", 1, 1), 
    c("ICON_IMAGE_STYLE_CROP", 2, 2), 
    d("ICON_IMAGE_STYLE_UNCHANGED", 3, 3);
    
    private final int f;
    
    private ahrs(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return ahng.u;
    }
    
    public static ahrs b(final int n) {
        if (n == 0) {
            return ahrs.a;
        }
        if (n == 1) {
            return ahrs.b;
        }
        if (n == 2) {
            return ahrs.c;
        }
        if (n != 3) {
            return null;
        }
        return ahrs.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
