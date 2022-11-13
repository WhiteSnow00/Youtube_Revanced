import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcw extends ahbh implements ahcw
{
    public static final ajcw a;
    private static volatile ahdd c;
    public ahcr b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcw.class, (ahbh)(a = new ajcw()));
    }
    
    private ajcw() {
        this.b = ahcr.a;
        this.d = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajcw.c) == null) {
                    synchronized (ajcw.class) {
                        if (ajcw.c == null) {
                            ajcw.c = (ahdd)new ahba((ahbh)ajcw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcw.a);
            }
            case 3: {
                return new ajcw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcw.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002\u0432", new Object[] { "b", ajcv.a });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
