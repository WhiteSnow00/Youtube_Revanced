import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoz extends ahbh implements ahcw
{
    public static final apoz a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apoz.class, (ahbh)(a = new apoz()));
    }
    
    private apoz() {
        this.e = 2;
        final ahab b = ahab.b;
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
                if ((b = apoz.b) == null) {
                    synchronized (apoz.class) {
                        if (apoz.b == null) {
                            apoz.b = (ahdd)new ahba((ahbh)apoz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoz.a;
            }
            case 4: {
                return new ahaz((ahbh)apoz.a);
            }
            case 3: {
                return new apoz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoz.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
