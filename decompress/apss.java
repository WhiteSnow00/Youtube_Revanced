import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apss extends ahcz implements aheo
{
    private static final apss a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(apss.class, a = new apss());
    }
    
    private apss() {
    }
    
    public static apsr a() {
        return (apsr)apss.a.createBuilder();
    }
    
    static apss b() {
        return apss.a;
    }
    
    public static void c(final apss apss, final boolean b) {
        apss.d(b);
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
                if ((b = apss.b) == null) {
                    synchronized (apss.class) {
                        if (apss.b == null) {
                            apss.b = (ahev)new ahcs((ahcz)apss.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apss.a;
            }
            case 4: {
                return new apsr();
            }
            case 3: {
                return new apss();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apss.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
