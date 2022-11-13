import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgh extends ahbh implements ahcw
{
    public static final akgh a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akgh.class, (ahbh)(a = new akgh()));
    }
    
    private akgh() {
        this.f = 2;
        this.b = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akgh.c) == null) {
                    synchronized (akgh.class) {
                        if (akgh.c == null) {
                            akgh.c = (ahdd)new ahba((ahbh)akgh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akgh.a;
            }
            case 4: {
                return new ahaz((ahbh)akgh.a);
            }
            case 3: {
                return new akgh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", aida.class, "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
