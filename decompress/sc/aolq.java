import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolq extends ahbh implements ahcw
{
    public static final aolq a;
    private static volatile ahdd d;
    public int b;
    public aolp c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aolq.class, (ahbh)(a = new aolq()));
    }
    
    private aolq() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aolq.d) == null) {
                    synchronized (aolq.class) {
                        if (aolq.d == null) {
                            aolq.d = (ahdd)new ahba((ahbh)aolq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aolq.a;
            }
            case 4: {
                return new ahaz((ahbh)aolq.a);
            }
            case 3: {
                return new aolq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolq.a, "\u0001\u0001\u0000\u0001\uffc9\u3a37\uffc9\u3a37\u0001\u0000\u0000\u0001\uffc9\u3a37\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
