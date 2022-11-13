import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anen extends ahbh implements ahcw
{
    public static final anen a;
    private static volatile ahdd c;
    public anem b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anen.class, (ahbh)(a = new anen()));
    }
    
    private anen() {
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
                if ((c = anen.c) == null) {
                    synchronized (anen.class) {
                        if (anen.c == null) {
                            anen.c = (ahdd)new ahba((ahbh)anen.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anen.a;
            }
            case 4: {
                return new ahaz((ahbh)anen.a);
            }
            case 3: {
                return new anen();
            }
            case 2: {
                return newMessageInfo((MessageLite)anen.a, "\u0001\u0001\u0000\u0001\uecfd\u3e94\uecfd\u3e94\u0001\u0000\u0000\u0001\uecfd\u3e94\u1409\u0000", new Object[] { "d", "b" });
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
