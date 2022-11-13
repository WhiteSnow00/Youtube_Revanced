import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcg extends ahbh implements ahcw
{
    public static final alcg a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public alch d;
    public ahbx e;
    private ajvo g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alcg.class, (ahbh)(a = new alcg()));
    }
    
    private alcg() {
        this.h = 2;
        this.e = emptyProtobufList();
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
                final ahdd f;
                if ((f = alcg.f) == null) {
                    synchronized (alcg.class) {
                        if (alcg.f == null) {
                            alcg.f = (ahdd)new ahba((ahbh)alcg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alcg.a;
            }
            case 4: {
                return new ahaz((ahbh)alcg.a);
            }
            case 3: {
                return new alcg();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcg.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u1009\u0001\u0004\u041b\u0309\u1409\u0002", new Object[] { "b", "c", "d", "e", aiqj.class, "g" });
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
