import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyb extends ahbh implements ahcw
{
    public static final aeyb a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)aeyb.class, (ahbh)(a = new aeyb()));
    }
    
    private aeyb() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aeyb.c) == null) {
                    synchronized (aeyb.class) {
                        if (aeyb.c == null) {
                            aeyb.c = (ahdd)new ahba((ahbh)aeyb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aeyb.a;
            }
            case 4: {
                return new ahaz((ahbh)aeyb.a);
            }
            case 3: {
                return new aeyb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aeyb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agoq.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
