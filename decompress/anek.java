import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anek extends ahbh implements ahcw
{
    public static final anek a;
    private static volatile ahdd d;
    public int b;
    public ajut c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anek.class, (ahbh)(a = new anek()));
    }
    
    private anek() {
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
                if ((d = anek.d) == null) {
                    synchronized (anek.class) {
                        if (anek.d == null) {
                            anek.d = (ahdd)new ahba((ahbh)anek.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anek.a;
            }
            case 4: {
                return new ahaz((ahbh)anek.a);
            }
            case 3: {
                return new anek();
            }
            case 2: {
                return newMessageInfo((MessageLite)anek.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
