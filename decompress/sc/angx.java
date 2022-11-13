import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angx extends ahbh implements ahcw
{
    public static final angx a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)angx.class, (ahbh)(a = new angx()));
    }
    
    private angx() {
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
                if ((c = angx.c) == null) {
                    synchronized (angx.class) {
                        if (angx.c == null) {
                            angx.c = (ahdd)new ahba((ahbh)angx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return angx.a;
            }
            case 4: {
                return new ahaz((ahbh)angx.a);
            }
            case 3: {
                return new angx();
            }
            case 2: {
                return newMessageInfo((MessageLite)angx.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", angw.class });
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
