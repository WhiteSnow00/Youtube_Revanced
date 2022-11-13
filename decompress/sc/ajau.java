import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajau extends ahbh implements ahcw
{
    public static final ajau a;
    private static volatile ahdd b;
    private int c;
    private apke d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajau.class, (ahbh)(a = new ajau()));
    }
    
    private ajau() {
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
                if ((b = ajau.b) == null) {
                    synchronized (ajau.class) {
                        if (ajau.b == null) {
                            ajau.b = (ahdd)new ahba((ahbh)ajau.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajau.a;
            }
            case 4: {
                return new ahaz((ahbh)ajau.a);
            }
            case 3: {
                return new ajau();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajau.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
