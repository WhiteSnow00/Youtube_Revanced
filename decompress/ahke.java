// 
// Decompiled by Procyon v0.6.0
// 

public enum ahke implements ahdd
{
    a("ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED", 0, 0), 
    b("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_AUDIBLE", 1, 1), 
    c("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_GENERIC", 2, 2), 
    d("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_HAPTIC", 3, 3), 
    e("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_SPOKEN", 4, 4), 
    f("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_VISUAL", 5, 5), 
    g("ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_BRAILLE", 6, 6);
    
    private static final ahke[] i;
    public final int h;
    
    private ahke(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return ahhs.p;
    }
    
    public static ahke b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahke.g;
            }
            case 5: {
                return ahke.f;
            }
            case 4: {
                return ahke.e;
            }
            case 3: {
                return ahke.d;
            }
            case 2: {
                return ahke.c;
            }
            case 1: {
                return ahke.b;
            }
            case 0: {
                return ahke.a;
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
