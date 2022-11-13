import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqed extends ahbh implements ahcw
{
    public static final aqed a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqed.class, (ahbh)(a = new aqed()));
    }
    
    private aqed() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqed.d) == null) {
                    synchronized (aqed.class) {
                        if (aqed.d == null) {
                            aqed.d = (ahdd)new ahba((ahbh)aqed.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqed.a;
            }
            case 4: {
                return new ahaz((ahbh)aqed.a);
            }
            case 3: {
                return new aqed();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqed.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u103c\u0000", new Object[] { "c", "b", aqcl.f, aqec.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
