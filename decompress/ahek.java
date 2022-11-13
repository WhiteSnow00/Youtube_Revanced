// 
// Decompiled by Procyon v0.6.0
// 

public enum ahek
{
    a("DOUBLE", 0, ahel.d, 1), 
    b("FLOAT", 1, ahel.c, 5), 
    c("INT64", 2, ahel.b, 0), 
    d("UINT64", 3, ahel.b, 0), 
    e("INT32", 4, ahel.a, 0), 
    f("FIXED64", 5, ahel.b, 1), 
    g("FIXED32", 6, ahel.a, 5), 
    h("BOOL", 7, ahel.e, 0), 
    i("STRING", 8, ahel.f, 2), 
    j("GROUP", 9, ahel.i, 3), 
    k("MESSAGE", 10, ahel.i, 2), 
    l("BYTES", 11, ahel.g, 2), 
    m("UINT32", 12, ahel.a, 0), 
    n("ENUM", 13, ahel.h, 0), 
    o("SFIXED32", 14, ahel.a, 5), 
    p("SFIXED64", 15, ahel.b, 1), 
    q("SINT32", 16, ahel.a, 0), 
    r("SINT64", 17, ahel.b, 0);
    
    private static final ahek[] u;
    public final ahel s;
    public final int t;
    
    private ahek(final String s, final int n, final ahel s2, final int t) {
        this.s = s2;
        this.t = t;
    }
}
