import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahif extends ahbh implements ahcw
{
    public static final ahif a;
    private static volatile ahdd d;
    public afos b;
    public ahab c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ahif.class, (ahbh)(a = new ahif()));
    }
    
    private ahif() {
        this.g = 2;
        this.c = ahab.b;
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
                final ahdd d;
                if ((d = ahif.d) == null) {
                    synchronized (ahif.class) {
                        if (ahif.d == null) {
                            ahif.d = (ahdd)new ahba((ahbh)ahif.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahif.a;
            }
            case 4: {
                return new ahaz((ahbh)ahif.a);
            }
            case 3: {
                return new ahif();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahif.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "e", "b", "f", "c" });
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
