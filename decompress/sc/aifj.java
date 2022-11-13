import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifj extends ahbh implements ahcw
{
    public static final aifj a;
    private static volatile ahdd b;
    private int c;
    private aijk d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifj.class, (ahbh)(a = new aifj()));
    }
    
    private aifj() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahdd b;
                if ((b = aifj.b) == null) {
                    synchronized (aifj.class) {
                        if (aifj.b == null) {
                            aifj.b = (ahdd)new ahba((ahbh)aifj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifj.a;
            }
            case 4: {
                return new ahaz((ahbh)aifj.a);
            }
            case 3: {
                return new aifj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifj.a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007\u1409\t", new Object[] { "c", "d" });
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
