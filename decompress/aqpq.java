import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpq extends ahcz implements aheo
{
    public static final aqpq a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqpq.class, a = new aqpq());
    }
    
    private aqpq() {
        this.b = "";
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
                if ((c = aqpq.c) == null) {
                    synchronized (aqpq.class) {
                        if (aqpq.c == null) {
                            aqpq.c = (ahev)new ahcs((ahcz)aqpq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqpq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpq.a);
            }
            case 3: {
                return new aqpq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
