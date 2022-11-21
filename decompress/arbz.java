import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbz extends ahcz implements aheo
{
    public static final arbz a;
    private static volatile ahev d;
    public int b;
    public aras c;
    
    static {
        ahcz.registerDefaultInstance(arbz.class, a = new arbz());
    }
    
    private arbz() {
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
                if ((d = arbz.d) == null) {
                    synchronized (arbz.class) {
                        if (arbz.d == null) {
                            arbz.d = (ahev)new ahcs((ahcz)arbz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbz.a;
            }
            case 4: {
                return new ahcr((ahcz)arbz.a);
            }
            case 3: {
                return new arbz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
