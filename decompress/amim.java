import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amim extends ahbh implements ahcw
{
    public static final amim a;
    private static volatile ahdd b;
    private int c;
    private alft d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amim.class, (ahbh)(a = new amim()));
    }
    
    private amim() {
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
                if ((b = amim.b) == null) {
                    synchronized (amim.class) {
                        if (amim.b == null) {
                            amim.b = (ahdd)new ahba((ahbh)amim.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amim.a;
            }
            case 4: {
                return new ahaz((ahbh)amim.a);
            }
            case 3: {
                return new amim();
            }
            case 2: {
                return newMessageInfo((MessageLite)amim.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "c", "d" });
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
