import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ales extends ahbh implements ahcw
{
    public static final ales a;
    private static volatile ahdd d;
    public akli b;
    public ahbx c;
    private int e;
    private anuv f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ales.class, (ahbh)(a = new ales()));
    }
    
    private ales() {
        this.h = 2;
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
                final ahdd d;
                if ((d = ales.d) == null) {
                    synchronized (ales.class) {
                        if (ales.d == null) {
                            ales.d = (ahdd)new ahba((ahbh)ales.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ales.a;
            }
            case 4: {
                return new ahaz((ahbh)ales.a);
            }
            case 3: {
                return new ales();
            }
            case 2: {
                return newMessageInfo((MessageLite)ales.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0004\u1409\u0001\u0005\u1409\u0003", new Object[] { "e", "b", "c", aiqj.class, "f", "g" });
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
