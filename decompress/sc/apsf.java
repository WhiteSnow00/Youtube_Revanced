import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsf extends ahbh implements ahcw
{
    public static final apsf a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apsf.class, (ahbh)(a = new apsf()));
    }
    
    private apsf() {
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
                if ((b = apsf.b) == null) {
                    synchronized (apsf.class) {
                        if (apsf.b == null) {
                            apsf.b = (ahdd)new ahba((ahbh)apsf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsf.a;
            }
            case 4: {
                return new ahaz((ahbh)apsf.a);
            }
            case 3: {
                return new apsf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsf.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
