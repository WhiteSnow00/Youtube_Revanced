import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcz extends agzd implements agze
{
    private static final arcz a;
    private static volatile ahbe b;
    private int c;
    private long d;
    private long e;
    private String f;
    private int g;
    private String h;
    private long i;
    private agzy j;
    private agyc k;
    private agyc m;
    private String n;
    private String o;
    private String p;
    private String q;
    private long r;
    private agyc s;
    private String t;
    private agzq u;
    private agzq v;
    private int w;
    private boolean x;
    private String y;
    private byte z;
    
    static {
        agzi.registerDefaultInstance((Class)arcz.class, (agzi)(a = new arcz()));
    }
    
    private arcz() {
        this.w = -1;
        this.z = 2;
        this.f = "";
        this.h = "";
        this.j = emptyProtobufList();
        this.k = agyc.b;
        final agyc b = agyc.b;
        this.m = b;
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = 180000L;
        this.s = b;
        this.t = "";
        this.u = emptyIntList();
        this.v = emptyIntList();
        this.y = "";
    }
    
    public static arcy g() {
        return (arcy)((agzi)arcz.a).createBuilder();
    }
    
    private void q(final agyc s) {
        this.c |= 0x80000;
        this.s = s;
    }
    
    private void r(final int g) {
        this.c |= 0x20;
        this.g = g;
    }
    
    private void s(final long i) {
        this.c |= 0x80;
        this.i = i;
    }
    
    private void t(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void u(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void v(final boolean b) {
        this.c |= 0x800000;
        this.x = true;
    }
    
    private void w(final agyc m) {
        m.getClass();
        this.c |= 0x800;
        this.m = m;
    }
    
    private void x(final long r) {
        this.c |= 0x20000;
        this.r = r;
    }
    
    public int a() {
        return this.g;
    }
    
    public long d() {
        return this.d;
    }
    
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
                if ((b2 = arcz.b) == null) {
                    synchronized (arcz.class) {
                        if (arcz.b == null) {
                            arcz.b = (ahbe)new agzb((agzi)arcz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return arcz.a;
            }
            case 4: {
                return new arcy();
            }
            case 3: {
                return new arcz();
            }
            case 2: {
                return newMessageInfo((MessageLite)arcz.a, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\u0000\u0001\u1002\u0000\u0006\u100a\u000b\u000b\u1004\u0005\f\u1002\u0007\u000f\u1010\u0011\u0011\u1002\u0001\u0012\u100a\u0013\u0019\u1007\u0017", new Object[] { "c", "d", "m", "g", "i", "r", "e", "s", "x" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.z = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
    
    public agyc f() {
        return this.m;
    }
}
