import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyb extends ahbh implements ahcw
{
    public static final aoyb a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyb.class, (ahbh)(a = new aoyb()));
    }
    
    private aoyb() {
        this.e = 2;
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
                if ((b = aoyb.b) == null) {
                    synchronized (aoyb.class) {
                        if (aoyb.b == null) {
                            aoyb.b = (ahdd)new ahba((ahbh)aoyb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyb.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyb.a);
            }
            case 3: {
                return new aoyb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
