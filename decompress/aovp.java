import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovp extends ahbh implements ahcw
{
    public static final aovp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private anuv f;
    private aida g;
    private ahhu h;
    private aiqj i;
    private aida j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aovp.class, (ahbh)(a = new aovp()));
    }
    
    private aovp() {
        this.k = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = aovp.b) == null) {
                    synchronized (aovp.class) {
                        if (aovp.b == null) {
                            aovp.b = (ahdd)new ahba((ahbh)aovp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovp.a;
            }
            case 4: {
                return new ahaz((ahbh)aovp.a);
            }
            case 3: {
                return new aovp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovp.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\b\u1409\u0005\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
