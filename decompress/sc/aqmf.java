import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmf extends ahbh implements ahcw
{
    public static final aqmf a;
    private static volatile ahdd e;
    public int b;
    public aqlh c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmf.class, (ahbh)(a = new aqmf()));
    }
    
    private aqmf() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqmf.e) == null) {
                    synchronized (aqmf.class) {
                        if (aqmf.e == null) {
                            aqmf.e = (ahdd)new ahba((ahbh)aqmf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqmf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmf.a);
            }
            case 3: {
                return new aqmf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
