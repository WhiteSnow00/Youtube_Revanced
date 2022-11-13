import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ajwn extends ahbh implements ahcw
{
    public static final ajwn a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwn.class, (ahbh)(a = new ajwn()));
    }
    
    private ajwn() {
        this.f = 2;
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
                if ((b = ajwn.b) == null) {
                    synchronized (ajwn.class) {
                        if (ajwn.b == null) {
                            ajwn.b = (ahdd)new ahba((ahbh)ajwn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwn.a);
            }
            case 3: {
                return new ajwn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
