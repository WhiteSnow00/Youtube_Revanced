import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojn extends ahbh implements ahcw
{
    public static final aojn a;
    private static volatile ahdd g;
    public int b;
    public ajut c;
    public ahbx d;
    public int e;
    public boolean f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aojn.class, (ahbh)(a = new aojn()));
    }
    
    private aojn() {
        this.h = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aojn.g) == null) {
                    synchronized (aojn.class) {
                        if (aojn.g == null) {
                            aojn.g = (ahdd)new ahba((ahbh)aojn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aojn.a;
            }
            case 4: {
                return new ahaz((ahbh)aojn.a);
            }
            case 3: {
                return new aojn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0003\u100c\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", anuv.class, "e", aoet.r, "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
