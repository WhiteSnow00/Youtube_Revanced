import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohs extends ahbh implements ahcw
{
    public static final aohs a;
    private static volatile ahdd f;
    public int b;
    public anuv c;
    public anuv d;
    public ahab e;
    private ahhu g;
    private ahmr h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aohs.class, (ahbh)(a = new aohs()));
    }
    
    private aohs() {
        this.i = 2;
        this.e = ahab.b;
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
                if ((f = aohs.f) == null) {
                    synchronized (aohs.class) {
                        if (aohs.f == null) {
                            aohs.f = (ahdd)new ahba((ahbh)aohs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aohs.a;
            }
            case 4: {
                return new ahaz((ahbh)aohs.a);
            }
            case 3: {
                return new aohs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohs.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u100a\u0005\t\u1409\u0006", new Object[] { "b", "c", "d", "g", "e", "h" });
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
