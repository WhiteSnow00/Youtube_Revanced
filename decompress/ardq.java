import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardq extends ahcz implements aheo
{
    public static final ardq a;
    private static volatile ahev c;
    public ahej b;
    
    static {
        ahcz.registerDefaultInstance(ardq.class, a = new ardq());
    }
    
    private ardq() {
        this.b = ahej.a;
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
                if ((c = ardq.c) == null) {
                    synchronized (ardq.class) {
                        if (ardq.c == null) {
                            ardq.c = (ahev)new ahcs((ahcz)ardq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ardq.a;
            }
            case 4: {
                return new ahcr((ahcz)ardq.a);
            }
            case 3: {
                return new ardq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ardp.a });
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
