import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoia extends ahbh implements ahcw
{
    public static final aoia a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoia.class, (ahbh)(a = new aoia()));
    }
    
    private aoia() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aoia.c) == null) {
                    synchronized (aoia.class) {
                        if (aoia.c == null) {
                            aoia.c = (ahdd)new ahba((ahbh)aoia.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoia.a;
            }
            case 4: {
                return new ahaz((ahbh)aoia.a);
            }
            case 3: {
                return new aoia();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoia.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anuv.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
