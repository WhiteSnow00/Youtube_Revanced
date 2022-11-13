import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgy extends ahbh implements ahcw
{
    public static final akgy a;
    private static volatile ahdd f;
    public akli b;
    public ahbx c;
    public anuv d;
    public anuv e;
    private int g;
    private aiqj h;
    private aiqj i;
    private ajvo j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akgy.class, (ahbh)(a = new akgy()));
    }
    
    private akgy() {
        this.k = 2;
        this.c = emptyProtobufList();
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
                final ahdd f;
                if ((f = akgy.f) == null) {
                    synchronized (akgy.class) {
                        if (akgy.f == null) {
                            akgy.f = (ahdd)new ahba((ahbh)akgy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akgy.a;
            }
            case 4: {
                return new ahaz((ahbh)akgy.a);
            }
            case 3: {
                return new akgy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgy.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\u0309\u1409\u0006", new Object[] { "g", "b", "c", anuv.class, "h", "d", "e", "i", "j" });
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
