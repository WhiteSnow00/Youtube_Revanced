import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxp extends ahcz implements aheo
{
    public static final alxp a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(alxp.class, a = new alxp());
    }
    
    private alxp() {
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
                if ((d = alxp.d) == null) {
                    synchronized (alxp.class) {
                        if (alxp.d == null) {
                            alxp.d = (ahev)new ahcs((ahcz)alxp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alxp.a;
            }
            case 4: {
                return new ahcr((ahcz)alxp.a);
            }
            case 3: {
                return new alxp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
