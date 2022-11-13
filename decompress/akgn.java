import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgn extends ahbh implements ahcw
{
    public static final akgn a;
    private static volatile ahdd c;
    public altz b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgn.class, (ahbh)(a = new akgn()));
    }
    
    private akgn() {
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
                final ahdd c;
                if ((c = akgn.c) == null) {
                    synchronized (akgn.class) {
                        if (akgn.c == null) {
                            akgn.c = (ahdd)new ahba((ahbh)akgn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akgn.a;
            }
            case 4: {
                return new ahaz((ahbh)akgn.a);
            }
            case 3: {
                return new akgn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgn.a, "\u0001\u0001\u0000\u0001\ue572\u3b21\ue572\u3b21\u0001\u0000\u0000\u0001\ue572\u3b21\u1409\u0000", new Object[] { "d", "b" });
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
