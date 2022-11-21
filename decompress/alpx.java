import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpx extends ahcz implements aheo
{
    public static final alpx a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(alpx.class, a = new alpx());
    }
    
    private alpx() {
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
                if ((g = alpx.g) == null) {
                    synchronized (alpx.class) {
                        if (alpx.g == null) {
                            alpx.g = (ahev)new ahcs((ahcz)alpx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alpx.a;
            }
            case 4: {
                return new ahcr((ahcz)alpx.a);
            }
            case 3: {
                return new alpx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpx.a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0005\u100b\u0005\u0006\u100b\u0006\n\u100b\u0003", new Object[] { "h", "b", "c", "e", "f", "d" });
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
