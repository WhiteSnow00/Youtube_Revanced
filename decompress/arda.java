import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arda extends ahcz implements aheo
{
    public static final arda a;
    private static volatile ahev e;
    public int b;
    public aras c;
    public arcz d;
    
    static {
        ahcz.registerDefaultInstance(arda.class, a = new arda());
    }
    
    private arda() {
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
                if ((e = arda.e) == null) {
                    synchronized (arda.class) {
                        if (arda.e == null) {
                            arda.e = (ahev)new ahcs((ahcz)arda.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arda.a;
            }
            case 4: {
                return new ahcr((ahcz)arda.a);
            }
            case 3: {
                return new arda();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arda.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
