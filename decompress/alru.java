import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alru extends ahbh implements ahcw
{
    public static final alru a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private anuv f;
    private anuv g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alru.class, (ahbh)(a = new alru()));
    }
    
    private alru() {
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
                if ((b = alru.b) == null) {
                    synchronized (alru.class) {
                        if (alru.b == null) {
                            alru.b = (ahdd)new ahba((ahbh)alru.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alru.a;
            }
            case 4: {
                return new ahaz((ahbh)alru.a);
            }
            case 3: {
                return new alru();
            }
            case 2: {
                return newMessageInfo((MessageLite)alru.a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0005\u1409\u0006\u0006\u1409\t\n\u1409\u0007\u000b\u1409\b", new Object[] { "c", "d", "e", "h", "f", "g" });
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
