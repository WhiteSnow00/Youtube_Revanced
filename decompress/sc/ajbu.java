import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbu extends ahbh implements ahcw
{
    public static final ajbu a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbu.class, (ahbh)(a = new ajbu()));
    }
    
    private ajbu() {
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
                if ((b = ajbu.b) == null) {
                    synchronized (ajbu.class) {
                        if (ajbu.b == null) {
                            ajbu.b = (ahdd)new ahba((ahbh)ajbu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbu.a);
            }
            case 3: {
                return new ajbu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbu.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
