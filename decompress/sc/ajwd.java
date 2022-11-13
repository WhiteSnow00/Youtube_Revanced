import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwd extends ahbh implements ahcw
{
    public static final ajwd a;
    private static volatile ahdd b;
    private int c;
    private ajxb d;
    private ajut e;
    private ahhu f;
    private ajut g;
    private ajut h;
    private aiqj i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwd.class, (ahbh)(a = new ajwd()));
    }
    
    private ajwd() {
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
                if ((b = ajwd.b) == null) {
                    synchronized (ajwd.class) {
                        if (ajwd.b == null) {
                            ajwd.b = (ahdd)new ahba((ahbh)ajwd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwd.a);
            }
            case 3: {
                return new ajwd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwd.a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002\u1409\u0004\u0003\u1409\u0001\u0004\u1409\b\u0006\u1409\u0007\u0007\u1409\u0002\t\u1409\u0000", new Object[] { "c", "g", "e", "i", "h", "f", "d" });
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
