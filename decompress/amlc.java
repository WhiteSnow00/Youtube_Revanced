import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amlc extends ahbh implements ahcw
{
    public static final amlc a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)amlc.class, (ahbh)(a = new amlc()));
    }
    
    private amlc() {
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
                if ((b = amlc.b) == null) {
                    synchronized (amlc.class) {
                        if (amlc.b == null) {
                            amlc.b = (ahdd)new ahba((ahbh)amlc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amlc.a;
            }
            case 4: {
                return new ahaz((ahbh)amlc.a);
            }
            case 3: {
                return new amlc();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlc.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
