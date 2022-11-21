// 
// Decompiled by Procyon v0.6.0
// 

public enum arzh
{
    a("UNARY", 0), 
    b("CLIENT_STREAMING", 1), 
    c("SERVER_STREAMING", 2), 
    d("BIDI_STREAMING", 3), 
    e("UNKNOWN", 4);
    
    private static final arzh[] f;
    
    private arzh(final String s, final int n) {
    }
    
    public final boolean a() {
        return this == arzh.a || this == arzh.c;
    }
}
