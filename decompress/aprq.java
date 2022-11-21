import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprq extends ahcz implements aheo
{
    public static final aprq a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aprq.class, a = new aprq());
    }
    
    private aprq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aprq.c) == null) {
                    synchronized (aprq.class) {
                        if (aprq.c == null) {
                            aprq.c = (ahev)new ahcs((ahcz)aprq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aprq.a;
            }
            case 4: {
                return new ahcr((ahcz)aprq.a);
            }
            case 3: {
                return new aprq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aprh.k });
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
