import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbc extends ahbh implements ahcw
{
    public static final anbc a;
    private static volatile ahdd b;
    private int c;
    private anbb d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anbc.class, (ahbh)(a = new anbc()));
    }
    
    private anbc() {
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
                final ahdd b;
                if ((b = anbc.b) == null) {
                    synchronized (anbc.class) {
                        if (anbc.b == null) {
                            anbc.b = (ahdd)new ahba((ahbh)anbc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anbc.a;
            }
            case 4: {
                return new ahaz((ahbh)anbc.a);
            }
            case 3: {
                return new anbc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbc.a, "\u0001\u0001\u0000\u0001\uef4b\u3c9d\uef4b\u3c9d\u0001\u0000\u0000\u0001\uef4b\u3c9d\u1409\u0000", new Object[] { "c", "d" });
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