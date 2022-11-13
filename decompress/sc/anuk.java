import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuk extends ahbh implements ahcw
{
    public static final anuk a;
    public static final ahbf b;
    private static volatile ahdd d;
    public anuv c;
    private int e;
    private byte f;
    
    static {
        final anuk a2 = new anuk();
        ahbh.registerDefaultInstance((Class)anuk.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)anuu.a, (Object)a2, (MessageLite)a2, (ahbm)null, 196516197, ahek.k, (Class)anuk.class);
    }
    
    private anuk() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anuk.d) == null) {
                    synchronized (anuk.class) {
                        if (anuk.d == null) {
                            anuk.d = (ahdd)new ahba((ahbh)anuk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anuk.a;
            }
            case 4: {
                return new ahaz((ahbh)anuk.a);
            }
            case 3: {
                return new anuk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
