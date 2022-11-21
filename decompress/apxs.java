import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxs extends ahcz implements aheo
{
    public static final apxs a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(apxs.class, a = new apxs());
    }
    
    private apxs() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apxs.f) == null) {
                    synchronized (apxs.class) {
                        if (apxs.f == null) {
                            apxs.f = (ahev)new ahcs((ahcz)apxs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxs.a;
            }
            case 4: {
                return new ahcr((ahcz)apxs.a);
            }
            case 3: {
                return new apxs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
