import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqij extends ahcz implements aheo
{
    public static final aqij a;
    private static volatile ahev g;
    public int b;
    public aqik c;
    public aqik d;
    public aqik e;
    public aqik f;
    
    static {
        ahcz.registerDefaultInstance(aqij.class, a = new aqij());
    }
    
    private aqij() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqij.g) == null) {
                    synchronized (aqij.class) {
                        if (aqij.g == null) {
                            aqij.g = (ahev)new ahcs((ahcz)aqij.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqij.a;
            }
            case 4: {
                return new ahcr((ahcz)aqij.a);
            }
            case 3: {
                return new aqij();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqij.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
