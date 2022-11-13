import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojv extends ahbh implements ahcw
{
    public static final aojv a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public ahbx d;
    public int e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojv.class, (ahbh)(a = new aojv()));
    }
    
    private aojv() {
        this.g = 2;
        this.d = emptyProtobufList();
        this.e = -1;
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
                final ahdd f;
                if ((f = aojv.f) == null) {
                    synchronized (aojv.class) {
                        if (aojv.f == null) {
                            aojv.f = (ahdd)new ahba((ahbh)aojv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojv.a;
            }
            case 4: {
                return new ahaz((ahbh)aojv.a);
            }
            case 3: {
                return new aojv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0003\u1004\u0001", new Object[] { "b", "c", "d", anuv.class, "e" });
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
