import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akde extends ahbh implements ahcw
{
    public static final akde a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akde.class, (ahbh)(a = new akde()));
    }
    
    private akde() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akde.b) == null) {
                    synchronized (akde.class) {
                        if (akde.b == null) {
                            akde.b = (ahdd)new ahba((ahbh)akde.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akde.a;
            }
            case 4: {
                return new ahaz((ahbh)akde.a);
            }
            case 3: {
                return new akde();
            }
            case 2: {
                return newMessageInfo((MessageLite)akde.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
