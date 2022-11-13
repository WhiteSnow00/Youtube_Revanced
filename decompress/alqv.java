import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqv extends ahbh implements ahcw
{
    public static final alqv a;
    private static volatile ahdd t;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public alsj f;
    public ahbx g;
    public String h;
    public long i;
    public long j;
    public alqr k;
    public alqt l;
    public alqu m;
    public ahbx n;
    public anuv o;
    public anuv p;
    public ahab q;
    public boolean r;
    public ajut s;
    private ajut u;
    private anuv v;
    private alqy w;
    private ahhu x;
    private aiqj y;
    private byte z;
    
    static {
        ahbh.registerDefaultInstance((Class)alqv.class, (ahbh)(a = new alqv()));
    }
    
    private alqv() {
        this.c = 0;
        this.z = 2;
        this.g = emptyProtobufList();
        this.h = "";
        ahbh.emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = alqv.t) == null) {
                    synchronized (alqv.class) {
                        if (alqv.t == null) {
                            alqv.t = (ahdd)new ahba((ahbh)alqv.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return alqv.a;
            }
            case 4: {
                return new ahaz((ahbh)alqv.a);
            }
            case 3: {
                return new alqv();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqv.a, "\u0001\u0016\u0001\u0001\u0001\u001b\u0016\u0000\u0002\u000f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u103b\u0000\u0005\u1002\u0007\u0006\u1409\n\u0007\u1409\u000b\b\u1409\f\t\u1002\b\n\u1008\u0006\u000b\u041b\u0010\u1409\u000f\u0012\u1409\u0011\u0013\u100a\u0012\u0014\u1007\u0013\u0015\u143c\u0000\u0016\u1009\u0003\u0017\u1409\u0014\u0018\u1409\u0010\u0019\u1409\u000e\u001a\u1409\u0002\u001b\u1409\u0015", new Object[] { "d", "c", "b", "e", "u", "g", alqx.class, "i", "k", "l", "m", "j", "h", "n", alrb.class, "o", "x", "q", "r", alqq.class, "f", "s", "p", "w", "v", "y" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}
