import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbr extends ahbh implements ahcw
{
    public static final anbr a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anbr.class, (ahbh)(a = new anbr()));
    }
    
    private anbr() {
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
                if ((c = anbr.c) == null) {
                    synchronized (anbr.class) {
                        if (anbr.c == null) {
                            anbr.c = (ahdd)new ahba((ahbh)anbr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anbr.a;
            }
            case 4: {
                return new ahaz((char[][][])null, (boolean[])null);
            }
            case 3: {
                return new anbr();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", anbs.class, "e" });
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
