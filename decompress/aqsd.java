import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsd extends ahcz implements aheo
{
    public static final aqsd a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aqsd.class, a = new aqsd());
    }
    
    private aqsd() {
        this.c = "";
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
                if ((d = aqsd.d) == null) {
                    synchronized (aqsd.class) {
                        if (aqsd.d == null) {
                            aqsd.d = (ahev)new ahcs((ahcz)aqsd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsd.a);
            }
            case 3: {
                return new aqsd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
