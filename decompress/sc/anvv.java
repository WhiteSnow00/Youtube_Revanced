import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvv extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final anvv b;
    private static volatile ahdd h;
    public int c;
    public ahbx d;
    public ahbp e;
    public ajrq f;
    public int g;
    
    static {
        a = (ahbq)new alvv(10);
        ahbh.registerDefaultInstance((Class)anvv.class, (ahbh)(b = new anvv()));
    }
    
    private anvv() {
        this.d = ahbh.emptyProtobufList();
        this.e = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = anvv.h) == null) {
                    synchronized (anvv.class) {
                        if (anvv.h == null) {
                            anvv.h = (ahdd)new ahba((ahbh)anvv.b);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anvv.b;
            }
            case 4: {
                return new ahaz((ahbh)anvv.b);
            }
            case 3: {
                return new anvv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvv.b, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0002\u0000\u0001\u001e\u0002\u1009\u0000\t\u001a\n\u1004\u0007", new Object[] { "c", "e", aotz.a(), "f", "d", "g" });
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
