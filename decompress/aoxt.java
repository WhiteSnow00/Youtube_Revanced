import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxt extends ahbh implements ahcw
{
    public static final aoxt a;
    private static volatile ahdd b;
    private int c;
    private aida d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxt.class, (ahbh)(a = new aoxt()));
    }
    
    private aoxt() {
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
                if ((b = aoxt.b) == null) {
                    synchronized (aoxt.class) {
                        if (aoxt.b == null) {
                            aoxt.b = (ahdd)new ahba((ahbh)aoxt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxt.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxt.a);
            }
            case 3: {
                return new aoxt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxt.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
