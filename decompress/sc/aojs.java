import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojs extends ahbh implements ahcw
{
    public static final aojs a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aojs.class, (ahbh)(a = new aojs()));
    }
    
    private aojs() {
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
                if ((c = aojs.c) == null) {
                    synchronized (aojs.class) {
                        if (aojs.c == null) {
                            aojs.c = (ahdd)new ahba((ahbh)aojs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojs.a;
            }
            case 4: {
                return new ahaz((ahbh)aojs.a);
            }
            case 3: {
                return new aojs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojs.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", ajut.class });
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
