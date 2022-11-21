import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhp extends ahcz implements aheo
{
    public static final alhp a;
    private static volatile ahev d;
    public int b;
    public long c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(alhp.class, a = new alhp());
    }
    
    private alhp() {
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
                if ((d = alhp.d) == null) {
                    synchronized (alhp.class) {
                        if (alhp.d == null) {
                            alhp.d = (ahev)new ahcs((ahcz)alhp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alhp.a;
            }
            case 4: {
                return new ahcr((ahcz)alhp.a);
            }
            case 3: {
                return new alhp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhp.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003\u1004\u0002\u0005\u1003\u0003", new Object[] { "e", "b", "c" });
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
