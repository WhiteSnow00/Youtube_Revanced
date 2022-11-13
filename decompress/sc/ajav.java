import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajav extends ahbh implements ahcw
{
    public static final ajav a;
    private static volatile ahdd b;
    private int c;
    private ajau d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajav.class, (ahbh)(a = new ajav()));
    }
    
    private ajav() {
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
                if ((b = ajav.b) == null) {
                    synchronized (ajav.class) {
                        if (ajav.b == null) {
                            ajav.b = (ahdd)new ahba((ahbh)ajav.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajav.a;
            }
            case 4: {
                return new ahaz((ahbh)ajav.a);
            }
            case 3: {
                return new ajav();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajav.a, "\u0001\u0001\u0000\u0001\uf55b\u4557\uf55b\u4557\u0001\u0000\u0000\u0001\uf55b\u4557\u1409\u0000", new Object[] { "c", "d" });
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
