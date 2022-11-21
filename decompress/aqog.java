import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqog extends ahcz implements aheo
{
    public static final aqog a;
    private static volatile ahev h;
    public int b;
    public String c;
    public aqoc d;
    public aqof e;
    public aqof f;
    public aqof g;
    
    static {
        ahcz.registerDefaultInstance(aqog.class, a = new aqog());
    }
    
    private aqog() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqog.h) == null) {
                    synchronized (aqog.class) {
                        if (aqog.h == null) {
                            aqog.h = (ahev)new ahcs((ahcz)aqog.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqog.a;
            }
            case 4: {
                return new ahcr((ahcz)aqog.a);
            }
            case 3: {
                return new aqog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqog.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
