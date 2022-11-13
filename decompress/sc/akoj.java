import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoj extends ahbh implements ahcw
{
    public static final akoj a;
    private static volatile ahdd c;
    public ajut b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akoj.class, (ahbh)(a = new akoj()));
    }
    
    private akoj() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akoj.c) == null) {
                    synchronized (akoj.class) {
                        if (akoj.c == null) {
                            akoj.c = (ahdd)new ahba((ahbh)akoj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akoj.a;
            }
            case 4: {
                return new ahaz((ahbh)akoj.a);
            }
            case 3: {
                return new akoj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
