import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbr extends ahcz implements aheo
{
    private static final arbr a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(arbr.class, a = new arbr());
    }
    
    private arbr() {
    }
    
    public static arbq a() {
        return (arbq)arbr.a.createBuilder();
    }
    
    static arbr b() {
        return arbr.a;
    }
    
    public static void c(final arbr arbr, final boolean b) {
        arbr.d(b);
    }
    
    private void d(final boolean d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arbr.b) == null) {
                    synchronized (arbr.class) {
                        if (arbr.b == null) {
                            arbr.b = (ahev)new ahcs((ahcz)arbr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbr.a;
            }
            case 4: {
                return new arbq();
            }
            case 3: {
                return new arbr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
