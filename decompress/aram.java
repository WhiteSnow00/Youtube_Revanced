import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aram extends ahcz implements aheo
{
    public static final aram a;
    private static volatile ahev d;
    public int b;
    public aran c;
    
    static {
        ahcz.registerDefaultInstance(aram.class, a = new aram());
    }
    
    private aram() {
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
                if ((d = aram.d) == null) {
                    synchronized (aram.class) {
                        if (aram.d == null) {
                            aram.d = (ahev)new ahcs((ahcz)aram.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aram.a;
            }
            case 4: {
                return new ahcr((ahcz)aram.a);
            }
            case 3: {
                return new aram();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aram.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
