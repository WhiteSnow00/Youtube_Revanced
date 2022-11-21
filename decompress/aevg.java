// 
// Decompiled by Procyon v0.6.0
// 

public enum aevg
{
    a("APPLICATION_CREATE", 0), 
    b("ACTIVITY_CREATE", 1), 
    c("ACTIVITY_START", 2), 
    d("ACTIVITY_RESUME", 3), 
    e("ACTIVITY_PAUSE", 4), 
    f("ACTIVITY_STOP", 5), 
    g("ACTIVITY_DESTROY", 6), 
    h("INTENT_TO_ACTIVITY", 7);
    
    private static final aevg[] i;
    
    static {
        i = a();
    }
    
    private aevg(final String s, final int n) {
    }
    
    private static aevg[] a() {
        return new aevg[] { aevg.a, aevg.b, aevg.c, aevg.d, aevg.e, aevg.f, aevg.g, aevg.h };
    }
}
