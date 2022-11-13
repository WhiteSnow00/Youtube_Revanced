import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anaz extends ahbh implements ahcw
{
    public static final anaz a;
    private static volatile ahdd b;
    private int c;
    private anbd d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anaz.class, (ahbh)(a = new anaz()));
    }
    
    private anaz() {
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
                if ((b = anaz.b) == null) {
                    synchronized (anaz.class) {
                        if (anaz.b == null) {
                            anaz.b = (ahdd)new ahba((ahbh)anaz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anaz.a;
            }
            case 4: {
                return new ahaz((ahbh)anaz.a);
            }
            case 3: {
                return new anaz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anaz.a, "\u0001\u0001\u0000\u0001\ue4bf\u3c7e\ue4bf\u3c7e\u0001\u0000\u0000\u0001\ue4bf\u3c7e\u1409\u0000", new Object[] { "c", "d" });
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
