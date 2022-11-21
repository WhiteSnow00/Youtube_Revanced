import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoq extends ahcz implements aheo
{
    public static final ahoq a;
    private static volatile ahev c;
    public ahej b;
    
    static {
        ahcz.registerDefaultInstance(ahoq.class, a = new ahoq());
    }
    
    private ahoq() {
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
                if ((c = ahoq.c) == null) {
                    synchronized (ahoq.class) {
                        if (ahoq.c == null) {
                            ahoq.c = (ahev)new ahcs((ahcz)ahoq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahoq.a;
            }
            case 4: {
                return new ahcr((ahcz)ahoq.a);
            }
            case 3: {
                return new ahoq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahoq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ahoo.a });
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
