import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsu extends ahcz implements aheo
{
    private static final apsu a;
    private static volatile ahev b;
    private int c;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apsu.class, a = new apsu());
    }
    
    private apsu() {
    }
    
    public static apst a() {
        return (apst)apsu.a.createBuilder();
    }
    
    static apsu b() {
        return apsu.a;
    }
    
    public static void c(final apsu apsu, final int n) {
        apsu.d(n);
    }
    
    private void d(final int d) {
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
                if ((b = apsu.b) == null) {
                    synchronized (apsu.class) {
                        if (apsu.b == null) {
                            apsu.b = (ahev)new ahcs((ahcz)apsu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsu.a;
            }
            case 4: {
                return new apst();
            }
            case 3: {
                return new apsu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "c", "d" });
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
