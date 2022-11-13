import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojx extends ahbh implements ahcw
{
    public static final aojx a;
    private static volatile ahdd f;
    public int b;
    public anuv c;
    public ahab d;
    public anuv e;
    private ahhu g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aojx.class, (ahbh)(a = new aojx()));
    }
    
    private aojx() {
        this.i = 2;
        this.d = ahab.b;
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
                final ahdd f;
                if ((f = aojx.f) == null) {
                    synchronized (aojx.class) {
                        if (aojx.f == null) {
                            aojx.f = (ahdd)new ahba((ahbh)aojx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojx.a;
            }
            case 4: {
                return new ahaz((ahbh)aojx.a);
            }
            case 3: {
                return new aojx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojx.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "g", "d", "e", "h" });
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
