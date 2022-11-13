import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agop extends ahbh implements ahcw
{
    public static final agop a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public agoo d;
    
    static {
        ahbh.registerDefaultInstance((Class)agop.class, (ahbh)(a = new agop()));
    }
    
    private agop() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agop.e) == null) {
                    synchronized (agop.class) {
                        if (agop.e == null) {
                            agop.e = (ahdd)new ahba((ahbh)agop.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agop.a;
            }
            case 4: {
                return new ahaz((ahbh)agop.a);
            }
            case 3: {
                return new agop();
            }
            case 2: {
                return newMessageInfo((MessageLite)agop.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "b", "c", agon.class, "d" });
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
