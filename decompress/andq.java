import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andq extends ahcz implements aheo
{
    public static final andq a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(andq.class, a = new andq());
    }
    
    private andq() {
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
                if ((c = andq.c) == null) {
                    synchronized (andq.class) {
                        if (andq.c == null) {
                            andq.c = (ahev)new ahcs((ahcz)andq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return andq.a;
            }
            case 4: {
                return new ahcr((ahcz)andq.a);
            }
            case 3: {
                return new andq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "d", "b" });
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
