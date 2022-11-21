import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhv extends ahcz implements aheo
{
    public static final amhv a;
    private static volatile ahev d;
    public ahuh b;
    public anyu c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(amhv.class, a = new amhv());
    }
    
    private amhv() {
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
                if ((d = amhv.d) == null) {
                    synchronized (amhv.class) {
                        if (amhv.d == null) {
                            amhv.d = (ahev)new ahcs((ahcz)amhv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhv.a;
            }
            case 4: {
                return new ahcr((ahcz)amhv.a);
            }
            case 3: {
                return new amhv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhv.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "e", "b", "c" });
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
