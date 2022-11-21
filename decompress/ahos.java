import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahos extends ahcz implements aheo
{
    public static final ahos a;
    private static volatile ahev u;
    public ahdp b;
    public ahdp c;
    public ahdp d;
    public ahdp e;
    public ahdp f;
    public ahdp g;
    public ahdp h;
    public ahdp i;
    public ahdp j;
    public ahog k;
    public ahdp l;
    public ahdp m;
    public ahdp n;
    public ahdp o;
    public ahdp p;
    public ahdp q;
    public ahdp r;
    public ahdp s;
    public ahdp t;
    private int v;
    private byte w;
    
    static {
        ahcz.registerDefaultInstance(ahos.class, a = new ahos());
    }
    
    private ahos() {
        this.w = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
        this.l = ahcz.emptyProtobufList();
        this.m = ahcz.emptyProtobufList();
        this.n = ahcz.emptyProtobufList();
        this.o = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
        this.q = ahcz.emptyProtobufList();
        this.r = ahcz.emptyProtobufList();
        this.s = ahcz.emptyProtobufList();
        this.t = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev u;
                if ((u = ahos.u) == null) {
                    synchronized (ahos.class) {
                        if (ahos.u == null) {
                            ahos.u = (ahev)new ahcs((ahcz)ahos.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return ahos.a;
            }
            case 4: {
                return new ahcr((ahcz)ahos.a);
            }
            case 3: {
                return new ahos();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahos.a, "\u0001\u0013\u0000\u0001\u0001\u0017\u0013\u0000\u0012\u0013\u0001\u041b\u0002\u041b\u0005\u041b\u0007\u041b\b\u041b\t\u041b\n\u041b\u000b\u041b\f\u041b\r\u041b\u000e\u041b\u000f\u041b\u0010\u041b\u0012\u041b\u0013\u041b\u0014\u041b\u0015\u041b\u0016\u041b\u0017\u1409\u0000", new Object[] { "v", "b", aisc.class, "c", aisc.class, "d", aisc.class, "e", aisc.class, "f", aisc.class, "g", aisc.class, "h", ahpq.class, "i", aisc.class, "j", aisc.class, "l", aisc.class, "m", aisc.class, "n", aisc.class, "o", aisc.class, "p", aisc.class, "q", aisc.class, "r", aisc.class, "s", aisc.class, "t", aisc.class, "k" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
