import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpt extends ahcz implements aheo
{
    public static final aqpt a;
    private static volatile ahev f;
    public int b;
    public double c;
    public double d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(aqpt.class, a = new aqpt());
    }
    
    private aqpt() {
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
                if ((f = aqpt.f) == null) {
                    synchronized (aqpt.class) {
                        if (aqpt.f == null) {
                            aqpt.f = (ahev)new ahcs((ahcz)aqpt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpt.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpt.a);
            }
            case 3: {
                return new aqpt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u100b\u0002", new Object[] { "b", "c", "d", "e" });
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
