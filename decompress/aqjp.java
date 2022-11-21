import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjp extends ahcz implements aheo
{
    public static final aqjp a;
    private static volatile ahev e;
    public int b;
    public float c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(aqjp.class, a = new aqjp());
    }
    
    private aqjp() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqjp.e) == null) {
                    synchronized (aqjp.class) {
                        if (aqjp.e == null) {
                            aqjp.e = (ahev)new ahcs((ahcz)aqjp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqjp.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjp.a);
            }
            case 3: {
                return new aqjp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
