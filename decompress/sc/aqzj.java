import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzj extends ahbh implements ahcw
{
    private static final aqzj a;
    private static volatile ahdd b;
    private int c;
    private aqyt d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzj.class, (ahbh)(a = new aqzj()));
    }
    
    private aqzj() {
    }
    
    public static aqzj b() {
        return aqzj.a;
    }
    
    public static aqzj c() {
        return aqzj.a;
    }
    
    public aqyt a() {
        aqyt aqyt;
        if ((aqyt = this.d) == null) {
            aqyt = aqyt.a;
        }
        return aqyt;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzj.b) == null) {
                    synchronized (aqzj.class) {
                        if (aqzj.b == null) {
                            aqzj.b = (ahdd)new ahba((ahbh)aqzj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzj.a;
            }
            case 4: {
                return new ahaz((ahbh)b());
            }
            case 3: {
                return new aqzj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
