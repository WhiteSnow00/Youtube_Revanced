import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvw extends ahbh implements ahcw
{
    public static final anvw a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anvw.class, (ahbh)(a = new anvw()));
    }
    
    private anvw() {
        this.f = 2;
        final ahab b = ahab.b;
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
                if ((b = anvw.b) == null) {
                    synchronized (anvw.class) {
                        if (anvw.b == null) {
                            anvw.b = (ahdd)new ahba((ahbh)anvw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvw.a;
            }
            case 4: {
                return new ahaz((ahbh)anvw.a);
            }
            case 3: {
                return new anvw();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvw.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0005\u1409\u0005", new Object[] { "c", "d", "e" });
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
