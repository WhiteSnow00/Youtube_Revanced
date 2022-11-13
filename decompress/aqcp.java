import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcp extends ahbh implements ahcw
{
    public static final aqcp a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcp.class, (ahbh)(a = new aqcp()));
    }
    
    private aqcp() {
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
                if ((c = aqcp.c) == null) {
                    synchronized (aqcp.class) {
                        if (aqcp.c == null) {
                            aqcp.c = (ahdd)new ahba((ahbh)aqcp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcp.a);
            }
            case 3: {
                return new aqcp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcp.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002\u041b", new Object[] { "b", aqcs.class });
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
