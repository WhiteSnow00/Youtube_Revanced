import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ange extends ahbh implements ahcw
{
    public static final ange a;
    private static volatile ahdd d;
    public int b;
    public angf c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ange.class, (ahbh)(a = new ange()));
    }
    
    private ange() {
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
                if ((d = ange.d) == null) {
                    synchronized (ange.class) {
                        if (ange.d == null) {
                            ange.d = (ahdd)new ahba((ahbh)ange.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ange.a;
            }
            case 4: {
                return new ahaz((ahbh)ange.a);
            }
            case 3: {
                return new ange();
            }
            case 2: {
                return newMessageInfo((MessageLite)ange.a, "\u0001\u0001\u0000\u0001\uebc6\u36be\uebc6\u36be\u0001\u0000\u0000\u0001\uebc6\u36be\u1409\u0000", new Object[] { "b", "c" });
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
