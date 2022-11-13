import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlf extends ahbh implements ahcw
{
    public static final ahlf a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlf.class, (ahbh)(a = new ahlf()));
    }
    
    private ahlf() {
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
                if ((c = ahlf.c) == null) {
                    synchronized (ahlf.class) {
                        if (ahlf.c == null) {
                            ahlf.c = (ahdd)new ahba((ahbh)ahlf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlf.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlf.a);
            }
            case 3: {
                return new ahlf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", ajpm.class });
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
