// 
// Decompiled by Procyon v0.6.0
// 

public enum aruj
{
    a("UNARY", 0), 
    b("CLIENT_STREAMING", 1), 
    c("SERVER_STREAMING", 2), 
    d("BIDI_STREAMING", 3), 
    e("UNKNOWN", 4);
    
    private aruj(final String s, final int n) {
    }
    
    public final boolean a() {
        return this == aruj.a || this == aruj.c;
    }
}
