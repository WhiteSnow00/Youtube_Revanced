// 
// Decompiled by Procyon v0.6.0
// 

public enum aqil implements ahdd
{
    a("DYNAMIC_PROP_TYPE_UNKNOWN", 0, 0), 
    b("DYNAMIC_PROP_TYPE_BACKGROUND_COLOR", 1, 1), 
    c("DYNAMIC_PROP_TYPE_ALPHA", 2, 2), 
    d("DYNAMIC_PROP_TYPE_TRANSLATION_X", 3, 3), 
    e("DYNAMIC_PROP_TYPE_TRANSLATION_Y", 4, 4), 
    f("DYNAMIC_PROP_TYPE_SCALE", 5, 5), 
    g("DYNAMIC_PROP_TYPE_ROTATION", 6, 6);
    
    private static final aqil[] h;
    private final int i;
    
    private aqil(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
