import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhy extends ahbh implements ahcw
{
    public static final anhy a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private aiqj e;
    private aiqj f;
    private ajut g;
    private ajut h;
    private ankk i;
    private anhz j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anhy.class, (ahbh)(a = new anhy()));
    }
    
    private anhy() {
        this.l = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = anhy.b) == null) {
                    synchronized (anhy.class) {
                        if (anhy.b == null) {
                            anhy.b = (ahdd)new ahba((ahbh)anhy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anhy.a;
            }
            case 4: {
                return new ahaz((ahbh)anhy.a);
            }
            case 3: {
                return new anhy();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhy.a, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0000\b\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000b\r\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
