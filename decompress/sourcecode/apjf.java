// 
// Decompiled by Procyon v0.6.0
// 

public enum apjf implements agzm
{
    a("EFFECTS_FEATURE_UNKNOWN", 0, 0), 
    b("EFFECTS_FEATURE_DOT_ON_FILTER_ICON", 1, 1), 
    c("EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL", 2, 2), 
    @Deprecated
    d("EFFECTS_FEATURE_INSTANT_DYNAMIC_KAZOO", 3, 3), 
    e("EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT", 4, 4), 
    f("EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT", 5, 5), 
    g("EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS", 6, 6), 
    h("EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS", 7, 7), 
    @Deprecated
    i("EFFECTS_FEATURE_REELS_CAMERA_PRESETS", 8, 8), 
    @Deprecated
    j("EFFECTS_FEATURE_REELS_CAMERA_DEFAULT_PRESET", 9, 9);
    
    private final int l;
    
    private apjf(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static agzo a() {
        return apjd.c;
    }
    
    public static apjf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return apjf.j;
            }
            case 8: {
                return apjf.i;
            }
            case 7: {
                return apjf.h;
            }
            case 6: {
                return apjf.g;
            }
            case 5: {
                return apjf.f;
            }
            case 4: {
                return apjf.e;
            }
            case 3: {
                return apjf.d;
            }
            case 2: {
                return apjf.c;
            }
            case 1: {
                return apjf.b;
            }
            case 0: {
                return apjf.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.l;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}
