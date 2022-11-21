import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpy extends ahcz implements aheo
{
    public static final aqpy a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(aqpy.class, a = new aqpy());
    }
    
    private aqpy() {
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
                if ((f = aqpy.f) == null) {
                    synchronized (aqpy.class) {
                        if (aqpy.f == null) {
                            aqpy.f = (ahev)new ahcs((ahcz)aqpy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqpy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpy.a);
            }
            case 3: {
                return new aqpy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "b", "c", "d", "e" });
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
