import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjn extends ahbh implements ahcw
{
    public static final aqjn a;
    private static volatile ahdd b;
    private int c;
    private aqhx d;
    private aqdy e;
    private aqjo f;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjn.class, (ahbh)(a = new aqjn()));
    }
    
    private aqjn() {
        this.h = 2;
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
                if ((b = aqjn.b) == null) {
                    synchronized (aqjn.class) {
                        if (aqjn.b == null) {
                            aqjn.b = (ahdd)new ahba((ahbh)aqjn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjn.a);
            }
            case 3: {
                return new aqjn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjn.a, "\u0001\u0004\u0000\u0001\u0002\u000b\u0004\u0000\u0000\u0004\u0002\u1409\u0001\b\u1409\u0007\n\u1409\b\u000b\u1409\t", new Object[] { "c", "d", "e", "f", "g" });
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
