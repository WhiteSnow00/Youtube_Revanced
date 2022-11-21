import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algg extends ahcz implements aheo
{
    public static final algg a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(algg.class, a = new algg());
    }
    
    private algg() {
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
                if ((d = algg.d) == null) {
                    synchronized (algg.class) {
                        if (algg.d == null) {
                            algg.d = (ahev)new ahcs((ahcz)algg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algg.a;
            }
            case 4: {
                return new ahcr((ahcz)algg.a);
            }
            case 3: {
                return new algg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algg.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u1002\u0000", new Object[] { "b", "c" });
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
