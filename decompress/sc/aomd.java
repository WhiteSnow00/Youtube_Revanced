import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomd extends ahbh implements ahcw
{
    public static final aomd a;
    private static volatile ahdd b;
    private int c;
    private aond d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomd.class, (ahbh)(a = new aomd()));
    }
    
    private aomd() {
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
                if ((b = aomd.b) == null) {
                    synchronized (aomd.class) {
                        if (aomd.b == null) {
                            aomd.b = (ahdd)new ahba((ahbh)aomd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aomd.a;
            }
            case 4: {
                return new ahaz((ahbh)aomd.a);
            }
            case 3: {
                return new aomd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomd.a, "\u0001\u0001\u0000\u0001\uff7e\u2d27\uff7e\u2d27\u0001\u0000\u0000\u0001\uff7e\u2d27\u1409\u0000", new Object[] { "c", "d" });
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
