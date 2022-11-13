import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgm extends ahbh implements ahcw
{
    public static final akgm a;
    private static volatile ahdd c;
    public aiqj b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgm.class, (ahbh)(a = new akgm()));
    }
    
    private akgm() {
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
                if ((c = akgm.c) == null) {
                    synchronized (akgm.class) {
                        if (akgm.c == null) {
                            akgm.c = (ahdd)new ahba((ahbh)akgm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akgm.a;
            }
            case 4: {
                return new ahaz((ahbh)akgm.a);
            }
            case 3: {
                return new akgm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
