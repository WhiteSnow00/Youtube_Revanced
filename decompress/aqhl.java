import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhl extends ahcz implements aheo
{
    public static final aqhl a;
    private static volatile ahev f;
    public int b;
    public aqjp c;
    public aqjp d;
    public aqjp e;
    
    static {
        ahcz.registerDefaultInstance(aqhl.class, a = new aqhl());
    }
    
    private aqhl() {
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
                if ((f = aqhl.f) == null) {
                    synchronized (aqhl.class) {
                        if (aqhl.f == null) {
                            aqhl.f = (ahev)new ahcs((ahcz)aqhl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqhl.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhl.a);
            }
            case 3: {
                return new aqhl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
