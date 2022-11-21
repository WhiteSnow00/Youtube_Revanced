import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxt extends ahcz implements aheo
{
    public static final alxt a;
    private static volatile ahev d;
    public ajso b;
    public ajvi c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(alxt.class, a = new alxt());
    }
    
    private alxt() {
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
                if ((d = alxt.d) == null) {
                    synchronized (alxt.class) {
                        if (alxt.d == null) {
                            alxt.d = (ahev)new ahcs((ahcz)alxt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alxt.a;
            }
            case 4: {
                return new ahcr((ahcz)alxt.a);
            }
            case 3: {
                return new alxt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxt.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "e", "b", "c" });
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
