import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuw extends ahbh implements ahcw
{
    public static final akuw a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akuw.class, (ahbh)(a = new akuw()));
    }
    
    private akuw() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akuw.d) == null) {
                    synchronized (akuw.class) {
                        if (akuw.d == null) {
                            akuw.d = (ahdd)new ahba((ahbh)akuw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akuw.a;
            }
            case 4: {
                return new ahaz((ahbh)akuw.a);
            }
            case 3: {
                return new akuw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuw.a, "\u0001\u0002\u0001\u0000\ue1ae\u38da\ufeb7\u40e2\u0002\u0000\u0000\u0002\ue1ae\u38da\u143c\u0000\ufeb7\u40e2\u143c\u0000", new Object[] { "c", "b", aona.class, aomw.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
