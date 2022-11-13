import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldv extends ahbh implements ahcw
{
    public static final aldv a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aldv.class, (ahbh)(a = new aldv()));
    }
    
    private aldv() {
        this.d = 2;
        this.b = emptyProtobufList();
        ahbh.emptyProtobufList();
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
                if ((c = aldv.c) == null) {
                    synchronized (aldv.class) {
                        if (aldv.c == null) {
                            aldv.c = (ahdd)new ahba((ahbh)aldv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aldv.a;
            }
            case 4: {
                return new ahaz((ahbh)aldv.a);
            }
            case 3: {
                return new aldv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldv.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", ajbq.class });
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
