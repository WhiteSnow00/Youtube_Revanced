import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoke extends ahcz implements aheo
{
    public static final aoke a;
    private static volatile ahev c;
    public long b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aoke.class, a = new aoke());
    }
    
    private aoke() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aoke.c) == null) {
                    synchronized (aoke.class) {
                        if (aoke.c == null) {
                            aoke.c = (ahev)new ahcs((ahcz)aoke.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoke.a;
            }
            case 4: {
                return new ahcr((ahcz)aoke.a);
            }
            case 3: {
                return new aoke();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoke.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
