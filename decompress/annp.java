import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annp extends ahbh implements ahcw
{
    public static final annp a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private ajut g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)annp.class, (ahbh)(a = new annp()));
    }
    
    private annp() {
        this.i = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annp.b) == null) {
                    synchronized (annp.class) {
                        if (annp.b == null) {
                            annp.b = (ahdd)new ahba((ahbh)annp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annp.a;
            }
            case 4: {
                return new ahaz((ahbh)annp.a);
            }
            case 3: {
                return new annp();
            }
            case 2: {
                return newMessageInfo((MessageLite)annp.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0006\u1409\u0003\u0007\u1409\u0004", new Object[] { "c", "d", "e", "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
