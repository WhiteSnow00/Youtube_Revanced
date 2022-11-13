import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class alpr extends ahbh implements ahcw
{
    public static final alpr a;
    private static volatile ahdd e;
    public String b;
    public ahbx c;
    public aida d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alpr.class, (ahbh)(a = new alpr()));
    }
    
    private alpr() {
        this.h = 2;
        this.b = "";
        this.c = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd e;
                if ((e = alpr.e) == null) {
                    synchronized (alpr.class) {
                        if (alpr.e == null) {
                            alpr.e = (ahdd)new ahba((ahbh)alpr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alpr.a;
            }
            case 4: {
                return new ahaz((ahbh)alpr.a);
            }
            case 3: {
                return new alpr();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "f", "b", "c", alpq.class, "d", "g" });
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
