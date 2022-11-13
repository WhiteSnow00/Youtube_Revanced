import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlq extends ahbh implements ahcw
{
    public static final amlq a;
    private static volatile ahdd i;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public ajut f;
    public anuv g;
    public aiqj h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)amlq.class, (ahbh)(a = new amlq()));
    }
    
    private amlq() {
        this.k = 2;
        final ahab b = ahab.b;
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
                if ((i = amlq.i) == null) {
                    synchronized (amlq.class) {
                        if (amlq.i == null) {
                            amlq.i = (ahdd)new ahba((ahbh)amlq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amlq.a;
            }
            case 4: {
                return new ahaz((ahbh)amlq.a);
            }
            case 3: {
                return new amlq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlq.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "j", "h" });
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
