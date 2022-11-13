import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwu extends ahbh implements ahcw
{
    public static final ajwu a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private aiqj e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwu.class, (ahbh)(a = new ajwu()));
    }
    
    private ajwu() {
        this.f = 2;
        final ahab b = ahab.b;
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
                if ((b = ajwu.b) == null) {
                    synchronized (ajwu.class) {
                        if (ajwu.b == null) {
                            ajwu.b = (ahdd)new ahba((ahbh)ajwu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwu.a);
            }
            case 3: {
                return new ajwu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwu.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
