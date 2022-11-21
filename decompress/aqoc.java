import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoc extends ahcz implements aheo
{
    public static final aqoc a;
    private static volatile ahev g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    
    static {
        ahcz.registerDefaultInstance(aqoc.class, a = new aqoc());
    }
    
    private aqoc() {
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
                if ((g = aqoc.g) == null) {
                    synchronized (aqoc.class) {
                        if (aqoc.g == null) {
                            aqoc.g = (ahev)new ahcs((ahcz)aqoc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqoc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqoc.a);
            }
            case 3: {
                return new aqoc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoc.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u1001\u0000\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1001\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
