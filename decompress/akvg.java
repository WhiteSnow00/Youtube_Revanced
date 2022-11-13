import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvg extends ahbh implements ahcw
{
    public static final akvg a;
    private static volatile ahdd e;
    public akli b;
    public boolean c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akvg.class, (ahbh)(a = new akvg()));
    }
    
    private akvg() {
        this.g = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akvg.e) == null) {
                    synchronized (akvg.class) {
                        if (akvg.e == null) {
                            akvg.e = (ahdd)new ahba((ahbh)akvg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akvg.a;
            }
            case 4: {
                return new ahaz((ahbh)akvg.a);
            }
            case 3: {
                return new akvg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvg.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0004\u041b", new Object[] { "f", "b", "c", "d", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
