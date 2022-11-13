import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleq extends ahbh implements ahcw
{
    public static final aleq a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aleq.class, (ahbh)(a = new aleq()));
    }
    
    private aleq() {
        this.f = 2;
        this.b = emptyProtobufList();
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
                if ((c = aleq.c) == null) {
                    synchronized (aleq.class) {
                        if (aleq.c == null) {
                            aleq.c = (ahdd)new ahba((ahbh)aleq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aleq.a;
            }
            case 4: {
                return new ahaz((ahbh)aleq.a);
            }
            case 3: {
                return new aleq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", alep.class, "e" });
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
