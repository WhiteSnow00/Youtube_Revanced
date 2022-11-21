import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbm extends ahcz implements aheo
{
    public static final arbm a;
    private static volatile ahev e;
    public arbn b;
    public arbn c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(arbm.class, a = new arbm());
    }
    
    private arbm() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = arbm.e) == null) {
                    synchronized (arbm.class) {
                        if (arbm.e == null) {
                            arbm.e = (ahev)new ahcs((ahcz)arbm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arbm.a;
            }
            case 4: {
                return new ahcr((ahcz)arbm.a);
            }
            case 3: {
                return new arbm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u100c\u0002", new Object[] { "f", "b", "c", "d", aqym.n });
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
