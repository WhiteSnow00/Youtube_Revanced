import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmq extends ahcz implements aheo
{
    public static final ahmq a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahmq.class, a = new ahmq());
    }
    
    private ahmq() {
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
                if ((c = ahmq.c) == null) {
                    synchronized (ahmq.class) {
                        if (ahmq.c == null) {
                            ahmq.c = (ahev)new ahcs((ahcz)ahmq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmq.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmq.a);
            }
            case 3: {
                return new ahmq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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
