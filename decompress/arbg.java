import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbg extends ahcz implements aheo
{
    private static final arbg a;
    private static volatile ahev b;
    private int c;
    private long d;
    
    static {
        ahcz.registerDefaultInstance(arbg.class, a = new arbg());
    }
    
    private arbg() {
    }
    
    public static arbf a() {
        return (arbf)arbg.a.createBuilder();
    }
    
    static arbg b() {
        return arbg.a;
    }
    
    public static void c(final arbg arbg, final long n) {
        arbg.d(n);
    }
    
    private void d(final long d) {
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
                if ((b = arbg.b) == null) {
                    synchronized (arbg.class) {
                        if (arbg.b == null) {
                            arbg.b = (ahev)new ahcs((ahcz)arbg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbg.a;
            }
            case 4: {
                return new arbf();
            }
            case 3: {
                return new arbg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "c", "d" });
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
