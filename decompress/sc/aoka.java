import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoka extends ahbh implements ahcw
{
    public static final aoka a;
    private static volatile ahdd i;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public ahbx f;
    public ajut g;
    public anuv h;
    private anuv j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoka.class, (ahbh)(a = new aoka()));
    }
    
    private aoka() {
        this.k = 2;
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aoka.i) == null) {
                    synchronized (aoka.class) {
                        if (aoka.i == null) {
                            aoka.i = (ahdd)new ahba((ahbh)aoka.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoka.a;
            }
            case 4: {
                return new ahaz((ahbh)aoka.a);
            }
            case 3: {
                return new aoka();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoka.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", aotp.class, "g", "h", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
