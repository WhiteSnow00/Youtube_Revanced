import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhy extends ahbh implements ahcw
{
    public static final ahhy a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public anuv d;
    public String e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhy.class, (ahbh)(a = new ahhy()));
    }
    
    private ahhy() {
        this.h = 2;
        this.c = "";
        ahbh.emptyProtobufList();
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ahhy.g) == null) {
                    synchronized (ahhy.class) {
                        if (ahhy.g == null) {
                            ahhy.g = (ahdd)new ahba((ahbh)ahhy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahhy.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhy.a);
            }
            case 3: {
                return new ahhy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhy.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1008\u0002\u0005\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
