import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anmx extends ahbh implements ahcw
{
    public static final anmx a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anmx.class, (ahbh)(a = new anmx()));
    }
    
    private anmx() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anmx.b) == null) {
                    synchronized (anmx.class) {
                        if (anmx.b == null) {
                            anmx.b = (ahdd)new ahba((ahbh)anmx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anmx.a;
            }
            case 4: {
                return new ahaz((ahbh)anmx.a);
            }
            case 3: {
                return new anmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)anmx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
