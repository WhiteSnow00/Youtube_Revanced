import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhi extends ahcz implements aheo
{
    public static final amhi a;
    private static volatile ahev d;
    public int b;
    public amhh c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(amhi.class, a = new amhi());
    }
    
    private amhi() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amhi.d) == null) {
                    synchronized (amhi.class) {
                        if (amhi.d == null) {
                            amhi.d = (ahev)new ahcs((ahcz)amhi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhi.a;
            }
            case 4: {
                return new ahcr((ahcz)amhi.a);
            }
            case 3: {
                return new amhi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "e", "b", amgw.h, "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
