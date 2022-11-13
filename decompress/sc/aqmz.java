import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmz extends ahbh implements ahcw
{
    public static final aqmz a;
    private static volatile ahdd e;
    public int b;
    public Object c;
    public ahbk d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmz.class, (ahbh)(a = new aqmz()));
    }
    
    private aqmz() {
        this.b = 0;
        this.d = emptyDoubleList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqmz.e) == null) {
                    synchronized (aqmz.class) {
                        if (aqmz.e == null) {
                            aqmz.e = (ahdd)new ahba((ahbh)aqmz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqmz.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmz.a);
            }
            case 3: {
                return new aqmz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmz.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0012\u0002\u103c\u0000", new Object[] { "c", "b", "d", aqmy.class });
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
