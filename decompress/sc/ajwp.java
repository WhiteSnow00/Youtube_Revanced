import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwp extends ahbh implements ahcw
{
    public static final ajwp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwp.class, (ahbh)(a = new ajwp()));
    }
    
    private ajwp() {
        this.h = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajwp.b) == null) {
                    synchronized (ajwp.class) {
                        if (ajwp.b == null) {
                            ajwp.b = (ahdd)new ahba((ahbh)ajwp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwp.a);
            }
            case 3: {
                return new ajwp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwp.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002\u1409\u0005\u0003\u1409\u0000\u0005\u1409\u0002\u0006\u1409\u0003", new Object[] { "c", "g", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
