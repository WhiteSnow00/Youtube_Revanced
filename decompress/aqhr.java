import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhr extends ahcz implements aheo
{
    public static final aqhr a;
    private static volatile ahev d;
    public int b;
    public aqjp c;
    
    static {
        ahcz.registerDefaultInstance(aqhr.class, a = new aqhr());
    }
    
    private aqhr() {
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
                if ((d = aqhr.d) == null) {
                    synchronized (aqhr.class) {
                        if (aqhr.d == null) {
                            aqhr.d = (ahev)new ahcs((ahcz)aqhr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqhr.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhr.a);
            }
            case 3: {
                return new aqhr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
