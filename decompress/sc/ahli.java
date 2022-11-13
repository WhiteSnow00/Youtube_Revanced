import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahli extends ahbh implements ahcw
{
    public static final ahli a;
    private static volatile ahdd j;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aiqj f;
    public ahbx g;
    public ajut h;
    public aiqj i;
    private ajut k;
    private anuv l;
    private anuv m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)ahli.class, (ahbh)(a = new ahli()));
    }
    
    private ahli() {
        this.o = 2;
        this.g = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ahli.j) == null) {
                    synchronized (ahli.class) {
                        if (ahli.j == null) {
                            ahli.j = (ahdd)new ahba((ahbh)ahli.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahli.a;
            }
            case 4: {
                return new ahaz((ahbh)ahli.a);
            }
            case 3: {
                return new ahli();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahli.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0005\u0007\u1409\u0003\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\u0007\r\u1409\u0004", new Object[] { "b", "c", "d", "e", "g", ahlh.class, "h", "f", "i", "m", "n", "l", "k" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
