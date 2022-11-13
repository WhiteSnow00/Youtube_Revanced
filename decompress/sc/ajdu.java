import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdu extends ahbh implements ahcw
{
    public static final ajdu a;
    private static volatile ahdd b;
    private int c;
    private ajdt d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdu.class, (ahbh)(a = new ajdu()));
    }
    
    private ajdu() {
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
                if ((b = ajdu.b) == null) {
                    synchronized (ajdu.class) {
                        if (ajdu.b == null) {
                            ajdu.b = (ahdd)new ahba((ahbh)ajdu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajdu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdu.a);
            }
            case 3: {
                return new ajdu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdu.a, "\u0001\u0001\u0000\u0001\uea42\u2d5e\uea42\u2d5e\u0001\u0000\u0000\u0001\uea42\u2d5e\u1409\u0000", new Object[] { "c", "d" });
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
