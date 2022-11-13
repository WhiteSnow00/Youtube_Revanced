import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknq extends ahbh implements ahcw
{
    public static final aknq a;
    private static volatile ahdd c;
    public akli b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aknq.class, (ahbh)(a = new aknq()));
    }
    
    private aknq() {
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
                if ((c = aknq.c) == null) {
                    synchronized (aknq.class) {
                        if (aknq.c == null) {
                            aknq.c = (ahdd)new ahba((ahbh)aknq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aknq.a;
            }
            case 4: {
                return new ahaz((ahbh)aknq.a);
            }
            case 3: {
                return new aknq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
