import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojo extends ahbh implements ahcw
{
    public static final aojo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private anuv f;
    private ajut g;
    private anuv h;
    private anuv i;
    private anuv j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aojo.class, (ahbh)(a = new aojo()));
    }
    
    private aojo() {
        this.k = 2;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = aojo.b) == null) {
                    synchronized (aojo.class) {
                        if (aojo.b == null) {
                            aojo.b = (ahdd)new ahba((ahbh)aojo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojo.a;
            }
            case 4: {
                return new ahaz((ahbh)aojo.a);
            }
            case 3: {
                return new aojo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojo.a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
