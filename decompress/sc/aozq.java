import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozq extends ahbh implements ahcw
{
    public static final aozq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aida g;
    private aida h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aozq.class, (ahbh)(a = new aozq()));
    }
    
    private aozq() {
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
                if ((b = aozq.b) == null) {
                    synchronized (aozq.class) {
                        if (aozq.b == null) {
                            aozq.b = (ahdd)new ahba((ahbh)aozq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozq.a;
            }
            case 4: {
                return new ahaz((ahbh)aozq.a);
            }
            case 3: {
                return new aozq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozq.a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0004\t\u1409\b\n\u1409\t\f\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
