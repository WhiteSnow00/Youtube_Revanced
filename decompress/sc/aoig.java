import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoig extends ahbh implements ahcw
{
    public static final aoig a;
    private static volatile ahdd q;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ahbx f;
    public int g;
    public int h;
    public int i;
    public aiqj j;
    public aoii k;
    public anuv l;
    public amgd m;
    public int n;
    public anuv o;
    public aoih p;
    private ajut r;
    private ajut s;
    private anuv t;
    private anuv u;
    private ahhu v;
    private byte w;
    
    static {
        ahbh.registerDefaultInstance((Class)aoig.class, (ahbh)(a = new aoig()));
    }
    
    private aoig() {
        this.w = 2;
        this.f = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd q;
                if ((q = aoig.q) == null) {
                    synchronized (aoig.class) {
                        if (aoig.q == null) {
                            aoig.q = (ahdd)new ahba((ahbh)aoig.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return aoig.a;
            }
            case 4: {
                return new ahaz((ahbh)aoig.a);
            }
            case 3: {
                return new aoig();
            }
            case 2: {
                final ahbn o3 = aoet.o;
                final ahbn n = aoet.n;
                return newMessageInfo((MessageLite)aoig.a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0001\u000e\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u000b\u0004\u1409\f\u0005\u041b\u0006\u1409\u000e\u0007\u1409\u0010\b\u1409\u0011\t\u1409\u0005\n\u1409\u0006\r\u1409\u0015\u000f\u1409\u0002\u0012\u100c\u000f\u0013\u100c\u0007\u0014\u100c\b\u0015\u100c\t\u0018\u1409\u0012\u0019\u1009\u0013\u001a\u1409\r", new Object[] { "b", "c", "d", "j", "k", "f", aiae.class, "m", "t", "u", "r", "s", "v", "e", "n", o3, "g", n, "h", n, "i", n, "o", "p", "l" });
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
