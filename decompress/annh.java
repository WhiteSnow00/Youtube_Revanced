import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annh extends ahbh implements ahcw
{
    public static final annh a;
    private static volatile ahdd e;
    public double b;
    public ajut c;
    public ajut d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)annh.class, (ahbh)(a = new annh()));
    }
    
    private annh() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = annh.e) == null) {
                    synchronized (annh.class) {
                        if (annh.e == null) {
                            annh.e = (ahdd)new ahba((ahbh)annh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return annh.a;
            }
            case 4: {
                return new ahaz((ahbh)annh.a);
            }
            case 3: {
                return new annh();
            }
            case 2: {
                return newMessageInfo((MessageLite)annh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1000\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
