import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidu extends ahcz implements aheo
{
    public static final aidu a;
    private static volatile ahev d;
    public int b;
    public float c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aidu.class, a = new aidu());
    }
    
    private aidu() {
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
                if ((d = aidu.d) == null) {
                    synchronized (aidu.class) {
                        if (aidu.d == null) {
                            aidu.d = (ahev)new ahcs((ahcz)aidu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidu.a;
            }
            case 4: {
                return new ahcr((ahcz)aidu.a);
            }
            case 3: {
                return new aidu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001", new Object[] { "e", "b", "c" });
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
