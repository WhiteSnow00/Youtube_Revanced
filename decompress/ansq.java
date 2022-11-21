import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansq extends ahcz implements aheo
{
    public static final ansq a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ansq.class, a = new ansq());
    }
    
    private ansq() {
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
                if ((c = ansq.c) == null) {
                    synchronized (ansq.class) {
                        if (ansq.c == null) {
                            ansq.c = (ahev)new ahcs((ahcz)ansq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ansq.a;
            }
            case 4: {
                return new ahcr((ahcz)ansq.a);
            }
            case 3: {
                return new ansq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ansp.a });
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
