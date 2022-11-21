import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubq extends ahcz implements aheo
{
    public static final aubq a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(aubq.class, a = new aubq());
    }
    
    private aubq() {
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
                if ((f = aubq.f) == null) {
                    synchronized (aubq.class) {
                        if (aubq.f == null) {
                            aubq.f = (ahev)new ahcs((ahcz)aubq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aubq.a;
            }
            case 4: {
                return new ahcr((ahcz)aubq.a);
            }
            case 3: {
                return new aubq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
