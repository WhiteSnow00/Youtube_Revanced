import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anij extends ahbh implements ahcw
{
    public static final anij a;
    private static volatile ahdd b;
    private int c;
    private aidt d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anij.class, (ahbh)(a = new anij()));
    }
    
    private anij() {
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
                final ahdd b;
                if ((b = anij.b) == null) {
                    synchronized (anij.class) {
                        if (anij.b == null) {
                            anij.b = (ahdd)new ahba((ahbh)anij.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anij.a;
            }
            case 4: {
                return new ahaz((ahbh)anij.a);
            }
            case 3: {
                return new anij();
            }
            case 2: {
                return newMessageInfo((MessageLite)anij.a, "\u0001\u0001\u0000\u0001\ue002\u1621\ue002\u1621\u0001\u0000\u0000\u0001\ue002\u1621\u1409\u0000", new Object[] { "c", "d" });
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
