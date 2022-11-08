import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afoz extends agzi implements ahax
{
    private static final afoz a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private long e;
    private String f;
    private String g;
    private String h;
    private String i;
    private agzq j;
    private agzy k;
    private agzy l;
    private agzy m;
    private agzy n;
    private agzy o;
    private int p;
    private afox q;
    private afpb r;
    private agzy s;
    private agzy t;
    private afov u;
    private agzy v;
    private byte w;
    
    static {
        agzi.registerDefaultInstance(afoz.class, a = new afoz());
    }
    
    private afoz() {
        this.w = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = agzi.emptyIntList();
        this.k = agzi.emptyProtobufList();
        this.l = agzi.emptyProtobufList();
        this.m = agzi.emptyProtobufList();
        this.n = agzi.emptyProtobufList();
        this.o = agzi.emptyProtobufList();
        this.s = agzi.emptyProtobufList();
        this.t = agzi.emptyProtobufList();
        this.v = agzi.emptyProtobufList();
    }
    
    public static afoy b() {
        return (afoy)afoz.a.createBuilder();
    }
    
    public static afoy c(final afoz afoz) {
        return (afoy)afoz.a.createBuilder(afoz);
    }
    
    private void n(final afow afow) {
        afow.getClass();
        this.o();
        this.s.add((Object)afow);
    }
    
    private void o() {
        final agzy s = this.s;
        if (!s.c()) {
            this.s = agzi.mutableCopy(s);
        }
    }
    
    private void p(final afov u) {
        u.getClass();
        this.u = u;
        this.d |= 0x200;
    }
    
    private void q(final afox q) {
        q.getClass();
        this.q = q;
        this.c |= Integer.MIN_VALUE;
    }
    
    private void r(final String h) {
        h.getClass();
        this.c |= 0x8000;
        this.h = h;
    }
    
    private void s(final String f) {
        this.c |= 0x800;
        this.f = f;
    }
    
    private void t(final int p) {
        this.c |= 0x20000000;
        this.p = p;
    }
    
    private void u(final String i) {
        this.c |= 0x20000;
        this.i = i;
    }
    
    private void v(final String g) {
        g.getClass();
        this.c |= 0x4000;
        this.g = g;
    }
    
    private void w(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    public afox a() {
        afox afox;
        if ((afox = this.q) == null) {
            afox = afox.a;
        }
        return afox;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = afoz.b) == null) {
                    synchronized (afoz.class) {
                        if (afoz.b == null) {
                            afoz.b = (ahbe)new agzb((agzi)afoz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return afoz.a;
            }
            case 4: {
                return new afoy();
            }
            case 3: {
                return new afoz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afoz.a, "\u0001\n\u0000\u0002\u0002;\n\u0000\u0001\u0001\u0002\u1002\u0001\t\u1008\u000e\r\u1008\u000b\u0011\u1008\u0011\u001f\u1006\u001d!\u1009\u001f%\u1409!(\u001b0\u1009);\u1008\u000f", new Object[] { "c", "d", "e", "g", "f", "i", "p", "q", "r", "s", afow.class, "u", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.w = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
