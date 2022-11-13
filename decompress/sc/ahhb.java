import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhb extends ahbh implements ahcw
{
    public static final ahhb a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhb.class, (ahbh)(a = new ahhb()));
    }
    
    private ahhb() {
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
                if ((b = ahhb.b) == null) {
                    synchronized (ahhb.class) {
                        if (ahhb.b == null) {
                            ahhb.b = (ahdd)new ahba((ahbh)ahhb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhb.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhb.a);
            }
            case 3: {
                return new ahhb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhb.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[] { "c", "d" });
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
