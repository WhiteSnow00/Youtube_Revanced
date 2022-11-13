import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anax extends ahbh implements ahcw
{
    public static final anax a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anax.class, (ahbh)(a = new anax()));
    }
    
    private anax() {
        this.e = 2;
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = anax.b) == null) {
                    synchronized (anax.class) {
                        if (anax.b == null) {
                            anax.b = (ahdd)new ahba((ahbh)anax.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anax.a;
            }
            case 4: {
                return new ahaz((ahbh)anax.a);
            }
            case 3: {
                return new anax();
            }
            case 2: {
                return newMessageInfo((MessageLite)anax.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[] { "c", "d" });
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
