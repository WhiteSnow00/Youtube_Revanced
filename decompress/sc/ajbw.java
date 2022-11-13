import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbw extends ahbh implements ahcw
{
    public static final ajbw a;
    private static volatile ahdd b;
    private int c;
    private ajbv d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbw.class, (ahbh)(a = new ajbw()));
    }
    
    private ajbw() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = ajbw.b) == null) {
                    synchronized (ajbw.class) {
                        if (ajbw.b == null) {
                            ajbw.b = (ahdd)new ahba((ahbh)ajbw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbw.a);
            }
            case 3: {
                return new ajbw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
