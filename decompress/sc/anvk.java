import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvk extends ahbh implements ahcw
{
    public static final anvk a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anvk.class, (ahbh)(a = new anvk()));
    }
    
    private anvk() {
        this.f = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anvk.b) == null) {
                    synchronized (anvk.class) {
                        if (anvk.b == null) {
                            anvk.b = (ahdd)new ahba((ahbh)anvk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvk.a;
            }
            case 4: {
                return new ahaz((ahbh)anvk.a);
            }
            case 3: {
                return new anvk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvk.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
