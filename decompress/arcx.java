import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcx extends ahcz implements aheo
{
    private static final arcx a;
    private static volatile ahev b;
    private int c;
    private long d;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(arcx.class, a = new arcx());
    }
    
    private arcx() {
    }
    
    public static arcw a() {
        return (arcw)arcx.a.createBuilder();
    }
    
    static arcx b() {
        return arcx.a;
    }
    
    public static void c(final arcx arcx, final long n) {
        arcx.f(n);
    }
    
    public static void d(final arcx arcx, final int n) {
        arcx.e(n);
    }
    
    private void e(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final long d) {
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
                if ((b = arcx.b) == null) {
                    synchronized (arcx.class) {
                        if (arcx.b == null) {
                            arcx.b = (ahev)new ahcs((ahcz)arcx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcx.a;
            }
            case 4: {
                return new arcw();
            }
            case 3: {
                return new arcx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "c", "d", "e" });
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
