import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjm extends ahcz implements aheo
{
    public static final amjm a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(amjm.class, a = new amjm());
    }
    
    private amjm() {
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
                if ((d = amjm.d) == null) {
                    synchronized (amjm.class) {
                        if (amjm.d == null) {
                            amjm.d = (ahev)new ahcs((ahcz)amjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjm.a;
            }
            case 4: {
                return new ahcr((ahcz)amjm.a);
            }
            case 3: {
                return new amjm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", amgw.n });
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
