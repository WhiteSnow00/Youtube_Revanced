import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdi implements asjr
{
    public static final jdi a;
    public static final jdi b;
    public static final jdi c;
    public static final jdi d;
    public static final jdi e;
    public static final jdi f;
    public static final jdi g;
    public static final jdi h;
    public static final jdi i;
    public static final jdi j;
    public static final jdi k;
    public static final jdi l;
    public static final jdi m;
    public static final jdi n;
    public static final jdi o;
    public static final jdi p;
    public static final jdi q;
    public static final jdi r;
    public static final jdi s;
    private final int t;
    
    static {
        s = new jdi(20);
        r = new jdi(19);
        q = new jdi(17);
        p = new jdi(16);
        o = new jdi(14);
        n = new jdi(13);
        m = new jdi(12);
        l = new jdi(11);
        k = new jdi(10);
        j = new jdi(9);
        i = new jdi(8);
        h = new jdi(7);
        g = new jdi(6);
        f = new jdi(5);
        e = new jdi(4);
        d = new jdi(3);
        c = new jdi(2);
        b = new jdi(1);
        a = new jdi(0);
    }
    
    public jdi(final int t) {
        this.t = t;
    }
    
    public final Object a(final Object o) {
        switch (this.t) {
            default: {
                ajdw ajdw;
                if ((ajdw = ((amkk)o).f) == null) {
                    ajdw = ajdw.a;
                }
                ajdv ajdv;
                if ((ajdv = ajdw.b) == null) {
                    ajdv = ajdv.a;
                }
                return ajdv;
            }
            case 19: {
                return aezp.k((Object)o);
            }
            case 18: {
                final exb exb = (exb)o;
                final boolean c = exb.c;
                final boolean f = exb.f;
                final ahaz builder = ((ahbh)ahuz.a).createBuilder();
                builder.copyOnWrite();
                final ahuz ahuz = (ahuz)builder.instance;
                ahuz.b |= 0x20000;
                ahuz.d = c;
                builder.copyOnWrite();
                final ahuz ahuz2 = (ahuz)builder.instance;
                ahuz2.b |= 0x40000;
                ahuz2.e = f;
                return builder.build();
            }
            case 17: {
                return ((alxw)o).X;
            }
            case 16: {
                alxw alxw;
                if ((alxw = ((akcn)o).e) == null) {
                    alxw = alxw.a;
                }
                return alxw;
            }
            case 15: {
                final boolean booleanValue = (boolean)o;
                final ahaz builder2 = ((ahbh)ahuz.a).createBuilder();
                builder2.copyOnWrite();
                final ahuz ahuz3 = (ahuz)builder2.instance;
                ahuz3.b |= 0x2000000;
                ahuz3.l = booleanValue;
                return builder2.build();
            }
            case 14: {
                apoc apoc;
                if ((apoc = apoc.b(((aqql)o).i)) == null) {
                    apoc = apoc.a;
                }
                return apoc;
            }
            case 13: {
                final fqx fqx = (fqx)o;
                Integer n;
                if ((fqx.b & 0x4) != 0x0) {
                    n = fqx.e;
                }
                else {
                    n = -1;
                }
                return n;
            }
            case 12: {
                return ((vfn)o).e();
            }
            case 11: {
                return asht.U((Iterable)o);
            }
            case 10: {
                return ((flm)o).b;
            }
            case 9: {
                return ((aezp)o).c();
            }
            case 8: {
                anxo anxo;
                if ((anxo = ((akcn)o).n) == null) {
                    anxo = anxo.a;
                }
                return anxo;
            }
            case 7: {
                return ((vft)o).c;
            }
            case 6: {
                final Boolean b = (Boolean)o;
                return Optional.empty();
            }
            case 5: {
                return ((aani)o).c();
            }
            case 4: {
                final Boolean b2 = (Boolean)o;
                return Optional.empty();
            }
            case 3: {
                return ((fwv)o).a;
            }
            case 2: {
                return ((aany)o).a().aa();
            }
            case 1: {
                return ((fqx)o).j;
            }
            case 0: {
                final jdk jdk = (jdk)((Optional)o).get();
                return jdk.d.e.Z((asjr)new jbe(jdk, 5)).i(ashb.e);
            }
        }
    }
}
