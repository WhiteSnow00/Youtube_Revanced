import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjz extends ahbh implements ahcw
{
    public static final ahjz a;
    private static volatile ahdd p;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aotp f;
    public ajut g;
    public anuv h;
    public aiqj i;
    public ahbx j;
    public anuv k;
    public anuv l;
    public anuv m;
    public anuv n;
    public ahab o;
    private aiqj q;
    private aiqj r;
    private aiqj s;
    private ahjy t;
    private ahhu u;
    private byte v;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjz.class, (ahbh)(a = new ahjz()));
    }
    
    private ahjz() {
        this.v = 2;
        this.j = emptyProtobufList();
        this.o = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = ahjz.p) == null) {
                    synchronized (ahjz.class) {
                        if (ahjz.p == null) {
                            ahjz.p = (ahdd)new ahba((ahbh)ahjz.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahjz.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjz.a);
            }
            case 3: {
                return new ahjz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjz.a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0011\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\u000b\u0007\u041b\b\u1409\t\t\u1409\u0001\n\u1409\n\u000b\u1409\u0005\r\u1409\f\u000e\u1409\r\u000f\u1409\u000f\u0010\u1409\u0010\u0011\u100a\u0011\u0012\u1409\u0006\u0013\u1409\u000e\u0014\u1409\u0002", new Object[] { "b", "c", "f", "q", "r", "t", "j", ajut.class, "i", "d", "s", "g", "k", "l", "n", "u", "o", "h", "m", "e" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
