import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoii extends ahbh implements ahcw
{
    public static final aoii a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoii.class, (ahbh)(a = new aoii()));
    }
    
    private aoii() {
        this.b = 0;
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
                if ((d = aoii.d) == null) {
                    synchronized (aoii.class) {
                        if (aoii.d == null) {
                            aoii.d = (ahdd)new ahba((ahbh)aoii.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoii.a;
            }
            case 4: {
                return new ahaz((ahbh)aoii.a);
            }
            case 3: {
                return new aoii();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoii.a, "\u0001\u0002\u0001\u0000\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u143c\u0000\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aome.class, aicz.class });
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
