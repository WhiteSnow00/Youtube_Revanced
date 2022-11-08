// 
// Decompiled by Procyon v0.6.0
// 

public enum ahcm
{
    a("DOUBLE", 0, ahcn.d, 1), 
    b("FLOAT", 1, ahcn.c, 5), 
    c("INT64", 2, ahcn.b, 0), 
    d("UINT64", 3, ahcn.b, 0), 
    e("INT32", 4, ahcn.a, 0), 
    f("FIXED64", 5, ahcn.b, 1), 
    g("FIXED32", 6, ahcn.a, 5), 
    h("BOOL", 7, ahcn.e, 0), 
    i("STRING", 8, ahcn.f, 2), 
    j("GROUP", 9, ahcn.i, 3), 
    k("MESSAGE", 10, ahcn.i, 2), 
    l("BYTES", 11, ahcn.g, 2), 
    m("UINT32", 12, ahcn.a, 0), 
    n("ENUM", 13, ahcn.h, 0), 
    o("SFIXED32", 14, ahcn.a, 5), 
    p("SFIXED64", 15, ahcn.b, 1), 
    q("SINT32", 16, ahcn.a, 0), 
    r("SINT64", 17, ahcn.b, 0);
    
    public final ahcn s;
    public final int t;
    
    private ahcm(final String s, final int n, final ahcn s2, final int t) {
        this.s = s2;
        this.t = t;
    }
}
