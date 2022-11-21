// 
// Decompiled by Procyon v0.6.0
// 

public final class aanc implements afax
{
    public static final aanc a;
    public static final aanc b;
    public static final aanc c;
    public static final aanc d;
    public static final aanc e;
    public static final aanc f;
    public static final aanc g;
    public static final aanc h;
    public static final aanc i;
    public static final aanc j;
    public static final aanc k;
    public static final aanc l;
    public static final aanc m;
    public static final aanc n;
    public static final aanc o;
    public static final aanc p;
    public static final aanc q;
    public static final aanc r;
    public static final aanc s;
    public static final aanc t;
    public static final aanc u;
    private final int v;
    
    static {
        u = new aanc(20);
        t = new aanc(19);
        s = new aanc(18);
        r = new aanc(17);
        q = new aanc(16);
        p = new aanc(15);
        o = new aanc(14);
        n = new aanc(13);
        m = new aanc(12);
        l = new aanc(11);
        k = new aanc(10);
        j = new aanc(9);
        i = new aanc(8);
        h = new aanc(7);
        g = new aanc(6);
        f = new aanc(5);
        e = new aanc(4);
        d = new aanc(3);
        c = new aanc(2);
        b = new aanc(1);
        a = new aanc(0);
    }
    
    private aanc(final int v) {
        this.v = v;
    }
    
    @Override
    public final Object apply(final Object o) {
        switch (this.v) {
            default: {
                return ((abyj)o).R();
            }
            case 19: {
                return ((abrq)o).v();
            }
            case 18: {
                return ((abyj)o).C();
            }
            case 17: {
                return ((abrq)o).v();
            }
            case 16: {
                return ((abyj)o).G();
            }
            case 15: {
                return ((abyj)o).G();
            }
            case 14: {
                final ahcr builder = ((aqty)o).toBuilder();
                builder.copyOnWrite();
                final aqty aqty = (aqty)builder.instance;
                aqty.b |= 0x2;
                aqty.d = false;
                return builder.build();
            }
            case 13: {
                final aqty aqty2 = (aqty)o;
                final int a = aayb.a;
                final ahcr builder2 = aqty2.toBuilder();
                builder2.copyOnWrite();
                final aqty aqty3 = (aqty)builder2.instance;
                aqty3.c = 1;
                aqty3.b |= 0x1;
                return builder2.build();
            }
            case 12: {
                final aqty aqty4 = (aqty)o;
                final int a2 = aayb.a;
                final ahcr builder3 = aqty4.toBuilder();
                builder3.copyOnWrite();
                final aqty aqty5 = (aqty)builder3.instance;
                aqty5.c = 2;
                aqty5.b |= 0x1;
                return builder3.build();
            }
            case 11: {
                return ((abxz)o).B();
            }
            case 10: {
                return ((abxz)o).H();
            }
            case 9: {
                return ((abyj)o).I();
            }
            case 8: {
                return ((abxz)o).D();
            }
            case 7: {
                return ((abxz)o).E();
            }
            case 6: {
                return ((abyj)o).L();
            }
            case 5: {
                return ((abxz)o).K();
            }
            case 4: {
                return ((abyj)o).I();
            }
            case 3: {
                return ((abxz)o).r();
            }
            case 2: {
                return ((abxz)o).H();
            }
            case 1: {
                return ((abyj)o).U();
            }
            case 0: {
                return ((abxz)o).A();
            }
        }
    }
}
