import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfz extends ahbh implements ahcw
{
    public static final akfz a;
    private static volatile ahdd r;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aotp f;
    public aiqj g;
    public alob h;
    public amgv i;
    public ajut j;
    public ajut k;
    public anuv l;
    public anuv m;
    public ahbx n;
    public akfx o;
    public anuv p;
    public ajut q;
    private aidg s;
    private ahhu t;
    private ajut u;
    private akgd v;
    private akfy w;
    private byte x;
    
    static {
        ahbh.registerDefaultInstance((Class)akfz.class, (ahbh)(a = new akfz()));
    }
    
    private akfz() {
        this.x = 2;
        final ahab b = ahab.b;
        this.n = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = akfz.r) == null) {
                    synchronized (akfz.class) {
                        if (akfz.r == null) {
                            akfz.r = (ahdd)new ahba((ahbh)akfz.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return akfz.a;
            }
            case 4: {
                return new ahaz((ahbh)akfz.a);
            }
            case 3: {
                return new akfz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfz.a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0001\u0014\u0001\u1409\u0000\u0002\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\t\u000b\u1409\u000b\f\u1409\f\r\u1409\u000e\u000f\u1409\u0001\u0010\u041b\u0011\u1409\u0011\u0013\u1409\u0012\u0014\u1409\r\u0015\u1409\u0013\u0016\u1409\u0010\u0017\u1409\u000f\u0018\u1409\u0014", new Object[] { "b", "c", "e", "f", "g", "h", "s", "i", "t", "u", "j", "v", "d", "n", aiae.class, "o", "w", "k", "p", "m", "l", "q" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
