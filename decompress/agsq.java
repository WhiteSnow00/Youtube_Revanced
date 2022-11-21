import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsq extends ahcz implements aheo
{
    public static final agsq a;
    private static volatile ahev c;
    public agst b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(agsq.class, a = new agsq());
    }
    
    private agsq() {
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
                if ((c = agsq.c) == null) {
                    synchronized (agsq.class) {
                        if (agsq.c == null) {
                            agsq.c = (ahev)new ahcs((ahcz)agsq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agsq.a;
            }
            case 4: {
                return new ahcr((ahcz)agsq.a);
            }
            case 3: {
                return new agsq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
