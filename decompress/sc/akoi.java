import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoi extends ahbh implements ahcw
{
    public static final akoi a;
    private static volatile ahdd f;
    public akli b;
    public ahbx c;
    public ahbx d;
    public ahab e;
    private int g;
    private ajvo h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)akoi.class, (ahbh)(a = new akoi()));
    }
    
    private akoi() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = ahab.b;
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
                final ahdd f;
                if ((f = akoi.f) == null) {
                    synchronized (akoi.class) {
                        if (akoi.f == null) {
                            akoi.f = (ahdd)new ahba((ahbh)akoi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akoi.a;
            }
            case 4: {
                return new ahaz((ahbh)akoi.a);
            }
            case 3: {
                return new akoi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoi.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0002\u0005\u0001\u1409\u0000\u0004\u041b\u0005\u041b\u000b\u1409\u0002\f\u100a\u0003\u0309\u1409\u0001", new Object[] { "g", "b", "c", akof.class, "d", aiqj.class, "i", "e", "h" });
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
