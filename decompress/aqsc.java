import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsc extends ahcz implements aheo
{
    public static final aqsc a;
    private static volatile ahev j;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    
    static {
        ahcz.registerDefaultInstance(aqsc.class, a = new aqsc());
    }
    
    private aqsc() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqsc.j) == null) {
                    synchronized (aqsc.class) {
                        if (aqsc.j == null) {
                            aqsc.j = (ahev)new ahcs((ahcz)aqsc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqsc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsc.a);
            }
            case 3: {
                return new aqsc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsc.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
