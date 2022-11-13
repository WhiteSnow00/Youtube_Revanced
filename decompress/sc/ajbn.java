import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbn extends ahbh implements ahcw
{
    public static final ajbn a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private ajut e;
    private ajut f;
    private ajut g;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbn.class, (ahbh)(a = new ajbn()));
    }
    
    private ajbn() {
        this.j = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajbn.b) == null) {
                    synchronized (ajbn.class) {
                        if (ajbn.b == null) {
                            ajbn.b = (ahdd)new ahba((ahbh)ajbn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbn.a);
            }
            case 3: {
                return new ajbn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbn.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0007\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
