// 
// Decompiled by Procyon v0.6.0
// 

public enum ahgp implements agzm
{
    a("ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED", 0, 0), 
    b("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_AUDIBLE", 1, 1), 
    c("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_GENERIC", 2, 2), 
    d("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_HAPTIC", 3, 3), 
    e("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_SPOKEN", 4, 4), 
    f("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_VISUAL", 5, 5), 
    g("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_BRAILLE", 6, 6);
    
    public final int h;
    
    private ahgp(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return ahec.p;
    }
    
    public static ahgp b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahgp.g;
            }
            case 5: {
                return ahgp.f;
            }
            case 4: {
                return ahgp.e;
            }
            case 3: {
                return ahgp.d;
            }
            case 2: {
                return ahgp.c;
            }
            case 1: {
                return ahgp.b;
            }
            case 0: {
                return ahgp.a;
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
