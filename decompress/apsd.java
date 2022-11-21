import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsd extends ahcz implements aheo
{
    private static final apsd a;
    private static volatile ahev b;
    private int c;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apsd.class, a = new apsd());
    }
    
    private apsd() {
    }
    
    public static apsc a() {
        return (apsc)apsd.a.createBuilder();
    }
    
    static apsd b() {
        return apsd.a;
    }
    
    public static void c(final apsd apsd, final apse apse) {
        apsd.d(apse);
    }
    
    private void d(final apse apse) {
        this.d = apse.getNumber();
        this.c |= 0x4;
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
                if ((b = apsd.b) == null) {
                    synchronized (apsd.class) {
                        if (apsd.b == null) {
                            apsd.b = (ahev)new ahcs((ahcz)apsd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsd.a;
            }
            case 4: {
                return new apsc();
            }
            case 3: {
                return new apsd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsd.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "c", "d", apse.a() });
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
