// 
// Decompiled by Procyon v0.6.0
// 

public enum agyx
{
    A("STRING_LIST", 26, 26, agyw.b, ahad.g), 
    B("MESSAGE_LIST", 27, 27, agyw.b, ahad.j), 
    C("BYTES_LIST", 28, 28, agyw.b, ahad.h), 
    D("UINT32_LIST", 29, 29, agyw.b, ahad.b), 
    E("ENUM_LIST", 30, 30, agyw.b, ahad.i), 
    F("SFIXED32_LIST", 31, 31, agyw.b, ahad.b), 
    G("SFIXED64_LIST", 32, 32, agyw.b, ahad.c), 
    H("SINT32_LIST", 33, 33, agyw.b, ahad.b), 
    I("SINT64_LIST", 34, 34, agyw.b, ahad.c), 
    J("DOUBLE_LIST_PACKED", 35, 35, agyw.c, ahad.e), 
    K("FLOAT_LIST_PACKED", 36, 36, agyw.c, ahad.d), 
    L("INT64_LIST_PACKED", 37, 37, agyw.c, ahad.c), 
    M("UINT64_LIST_PACKED", 38, 38, agyw.c, ahad.c), 
    N("INT32_LIST_PACKED", 39, 39, agyw.c, ahad.b), 
    O("FIXED64_LIST_PACKED", 40, 40, agyw.c, ahad.c), 
    P("FIXED32_LIST_PACKED", 41, 41, agyw.c, ahad.b), 
    Q("BOOL_LIST_PACKED", 42, 42, agyw.c, ahad.f), 
    R("UINT32_LIST_PACKED", 43, 43, agyw.c, ahad.b), 
    S("ENUM_LIST_PACKED", 44, 44, agyw.c, ahad.i), 
    T("SFIXED32_LIST_PACKED", 45, 45, agyw.c, ahad.b), 
    U("SFIXED64_LIST_PACKED", 46, 46, agyw.c, ahad.c), 
    V("SINT32_LIST_PACKED", 47, 47, agyw.c, ahad.b), 
    W("SINT64_LIST_PACKED", 48, 48, agyw.c, ahad.c), 
    X("GROUP_LIST", 49, 49, agyw.b, ahad.j), 
    Y("MAP", 50, 50, agyw.d, ahad.a), 
    a("DOUBLE", 0, 0, agyw.a, ahad.e);
    
    private static final agyx[] ab;
    
    b("FLOAT", 1, 1, agyw.a, ahad.d), 
    c("INT64", 2, 2, agyw.a, ahad.c), 
    d("UINT64", 3, 3, agyw.a, ahad.c), 
    e("INT32", 4, 4, agyw.a, ahad.b), 
    f("FIXED64", 5, 5, agyw.a, ahad.c), 
    g("FIXED32", 6, 6, agyw.a, ahad.b), 
    h("BOOL", 7, 7, agyw.a, ahad.f), 
    i("STRING", 8, 8, agyw.a, ahad.g), 
    j("MESSAGE", 9, 9, agyw.a, ahad.j), 
    k("BYTES", 10, 10, agyw.a, ahad.h), 
    l("UINT32", 11, 11, agyw.a, ahad.b), 
    m("ENUM", 12, 12, agyw.a, ahad.i), 
    n("SFIXED32", 13, 13, agyw.a, ahad.b), 
    o("SFIXED64", 14, 14, agyw.a, ahad.c), 
    p("SINT32", 15, 15, agyw.a, ahad.b), 
    q("SINT64", 16, 16, agyw.a, ahad.c), 
    r("GROUP", 17, 17, agyw.a, ahad.j), 
    s("DOUBLE_LIST", 18, 18, agyw.b, ahad.e), 
    t("FLOAT_LIST", 19, 19, agyw.b, ahad.d), 
    u("INT64_LIST", 20, 20, agyw.b, ahad.c), 
    v("UINT64_LIST", 21, 21, agyw.b, ahad.c), 
    w("INT32_LIST", 22, 22, agyw.b, ahad.b), 
    x("FIXED64_LIST", 23, 23, agyw.b, ahad.c), 
    y("FIXED32_LIST", 24, 24, agyw.b, ahad.b), 
    z("BOOL_LIST", 25, 25, agyw.b, ahad.f);
    
    public final int Z;
    public final agyw aa;
    
    static {
        final agyx[] values = values();
        final int length = values.length;
        ab = new agyx[length];
        for (final agyx agyx : values) {
            agyx.ab[agyx.Z] = agyx;
        }
    }
    
    private agyx(final String s, int ordinal, final int z, final agyw aa, final ahad ahad) {
        this.Z = z;
        this.aa = aa;
        final ahad a = ahad.a;
        final agyw a2 = agyw.a;
        ordinal = aa.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            final Class k = ahad.k;
        }
        if (aa == agyw.a) {
            ahad.ordinal();
        }
    }
}
