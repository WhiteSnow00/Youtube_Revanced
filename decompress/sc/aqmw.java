import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmw extends ahbh implements ahcw
{
    public static final aqmw a;
    private static volatile ahdd f;
    public int b;
    public double c;
    public int d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmw.class, (ahbh)(a = new aqmw()));
    }
    
    private aqmw() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqmw.f) == null) {
                    synchronized (aqmw.class) {
                        if (aqmw.f == null) {
                            aqmw.f = (ahdd)new ahba((ahbh)aqmw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqmw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmw.a);
            }
            case 3: {
                return new aqmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u100b\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
