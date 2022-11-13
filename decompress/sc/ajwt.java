import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwt extends ahbh implements ahcw
{
    public static final ajwt a;
    private static volatile ahdd b;
    private int c;
    private ajxb d;
    private ajut e;
    private ajxd f;
    private ahhu g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwt.class, (ahbh)(a = new ajwt()));
    }
    
    private ajwt() {
        this.l = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajwt.b) == null) {
                    synchronized (ajwt.class) {
                        if (ajwt.b == null) {
                            ajwt.b = (ahdd)new ahba((ahbh)ajwt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwt.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwt.a);
            }
            case 3: {
                return new ajwt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwt.a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001\u1409\n\u0002\u1409\u000f\u0003\u1409\u0010\u0004\u1409\u0011\b\u1409\u0004\f\u1409\u0000\r\u1409\u0005\u000f\u1409\u0003", new Object[] { "c", "h", "i", "j", "k", "f", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
