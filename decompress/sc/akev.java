import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akev extends ahbh implements ahcw
{
    public static final akev a;
    private static volatile ahdd b;
    private int c;
    private aiao d;
    private aiao e;
    private aiao f;
    private ajut g;
    private ajut h;
    private aiqj i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akev.class, (ahbh)(a = new akev()));
    }
    
    private akev() {
        this.k = 2;
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akev.b) == null) {
                    synchronized (akev.class) {
                        if (akev.b == null) {
                            akev.b = (ahdd)new ahba((ahbh)akev.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akev.a;
            }
            case 4: {
                return new ahaz((ahbh)akev.a);
            }
            case 3: {
                return new akev();
            }
            case 2: {
                return newMessageInfo((MessageLite)akev.a, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002\u1409\u0004\u0003\u1409\u0005\b\u1409\u0007\f\u1409\u0006\r\u1409\u0002\u000f\u1409\u0001\u0010\u1409\u0003", new Object[] { "c", "g", "h", "j", "i", "e", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
