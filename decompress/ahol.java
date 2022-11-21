import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahol extends ahcz implements aheo
{
    public static final ahol a;
    private static volatile ahev d;
    public int b;
    public amvh c;
    
    static {
        ahcz.registerDefaultInstance(ahol.class, a = new ahol());
    }
    
    private ahol() {
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
                if ((d = ahol.d) == null) {
                    synchronized (ahol.class) {
                        if (ahol.d == null) {
                            ahol.d = (ahev)new ahcs((ahcz)ahol.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahol.a;
            }
            case 4: {
                return new ahcr((ahcz)ahol.a);
            }
            case 3: {
                return new ahol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahol.a, "\u0001\u0001\u0000\u0001\uf2d9\u20b0\uf2d9\u20b0\u0001\u0000\u0000\u0000\uf2d9\u20b0\u1009\u0000", new Object[] { "b", "c" });
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
