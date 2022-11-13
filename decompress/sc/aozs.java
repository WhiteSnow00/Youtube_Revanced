import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozs extends ahbh implements ahcw
{
    public static final aozs a;
    private static volatile ahdd d;
    public int b;
    public aozi c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozs.class, (ahbh)(a = new aozs()));
    }
    
    private aozs() {
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
                if ((d = aozs.d) == null) {
                    synchronized (aozs.class) {
                        if (aozs.d == null) {
                            aozs.d = (ahdd)new ahba((ahbh)aozs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozs.a;
            }
            case 4: {
                return new ahaz((ahbh)aozs.a);
            }
            case 3: {
                return new aozs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozs.a, "\u0001\u0001\u0000\u0001\ufb36\u461e\ufb36\u461e\u0001\u0000\u0000\u0001\ufb36\u461e\u1409\u0000", new Object[] { "b", "c" });
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
