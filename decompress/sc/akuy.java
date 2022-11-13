import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuy extends ahbh implements ahcw
{
    public static final akuy a;
    private static volatile ahdd c;
    public akli b;
    private int d;
    private ahhu e;
    private amsk f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akuy.class, (ahbh)(a = new akuy()));
    }
    
    private akuy() {
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
                final ahdd c;
                if ((c = akuy.c) == null) {
                    synchronized (akuy.class) {
                        if (akuy.c == null) {
                            akuy.c = (ahdd)new ahba((ahbh)akuy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akuy.a;
            }
            case 4: {
                return new ahaz((ahbh)akuy.a);
            }
            case 3: {
                return new akuy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuy.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0005\u0006\u1409\u0003", new Object[] { "d", "b", "f", "e" });
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
