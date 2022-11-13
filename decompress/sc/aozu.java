import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozu extends ahbh implements ahcw
{
    public static final aozu a;
    private static volatile ahdd d;
    public int b;
    public aozt c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozu.class, (ahbh)(a = new aozu()));
    }
    
    private aozu() {
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
                final ahdd d;
                if ((d = aozu.d) == null) {
                    synchronized (aozu.class) {
                        if (aozu.d == null) {
                            aozu.d = (ahdd)new ahba((ahbh)aozu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozu.a;
            }
            case 4: {
                return new ahaz((ahbh)aozu.a);
            }
            case 3: {
                return new aozu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozu.a, "\u0001\u0001\u0000\u0001\ue4f7\u2c3b\ue4f7\u2c3b\u0001\u0000\u0000\u0001\ue4f7\u2c3b\u1409\u0000", new Object[] { "b", "c" });
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
