import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldh extends ahbh implements ahcw
{
    public static final aldh a;
    private static volatile ahdd f;
    public akli b;
    public ahbx c;
    public String d;
    public ahab e;
    private int g;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aldh.class, (ahbh)(a = new aldh()));
    }
    
    private aldh() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = "";
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
                if ((f = aldh.f) == null) {
                    synchronized (aldh.class) {
                        if (aldh.f == null) {
                            aldh.f = (ahdd)new ahba((ahbh)aldh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aldh.a;
            }
            case 4: {
                return new ahaz((ahbh)aldh.a);
            }
            case 3: {
                return new aldh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldh.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1008\u0001\u0006\u1409\u0002", new Object[] { "g", "b", "c", anuv.class, "i", "e", "d", "h" });
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
