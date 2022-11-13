import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anal extends ahbh implements ahcw
{
    public static final anal a;
    private static volatile ahdd c;
    public alft b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anal.class, (ahbh)(a = new anal()));
    }
    
    private anal() {
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
                final ahdd c;
                if ((c = anal.c) == null) {
                    synchronized (anal.class) {
                        if (anal.c == null) {
                            anal.c = (ahdd)new ahba((ahbh)anal.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anal.a;
            }
            case 4: {
                return new ahaz((ahbh)anal.a);
            }
            case 3: {
                return new anal();
            }
            case 2: {
                return newMessageInfo((MessageLite)anal.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "d", "b" });
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
