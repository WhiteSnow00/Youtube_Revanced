import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aprz extends ahbh implements ahcw
{
    public static final aprz a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private ajut e;
    private aiqj f;
    private ajut g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aprz.class, (ahbh)(a = new aprz()));
    }
    
    private aprz() {
        this.i = 2;
        this.b = emptyProtobufList();
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
                final ahdd c;
                if ((c = aprz.c) == null) {
                    synchronized (aprz.class) {
                        if (aprz.c == null) {
                            aprz.c = (ahdd)new ahba((ahbh)aprz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aprz.a;
            }
            case 4: {
                return new ahaz((ahbh)aprz.a);
            }
            case 3: {
                return new aprz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprz.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0002", new Object[] { "d", "e", "b", aprx.class, "f", "h", "g" });
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
