import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajaw extends ahbh implements ahcw
{
    public static final ajaw a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajaw.class, (ahbh)(a = new ajaw()));
    }
    
    private ajaw() {
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
                if ((b = ajaw.b) == null) {
                    synchronized (ajaw.class) {
                        if (ajaw.b == null) {
                            ajaw.b = (ahdd)new ahba((ahbh)ajaw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajaw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajaw.a);
            }
            case 3: {
                return new ajaw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajaw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
