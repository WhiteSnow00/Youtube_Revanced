import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhc extends ahbh implements ahcw
{
    public static final ahhc a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhc.class, (ahbh)(a = new ahhc()));
    }
    
    private ahhc() {
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
                final ahdd b;
                if ((b = ahhc.b) == null) {
                    synchronized (ahhc.class) {
                        if (ahhc.b == null) {
                            ahhc.b = (ahdd)new ahba((ahbh)ahhc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhc.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhc.a);
            }
            case 3: {
                return new ahhc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
