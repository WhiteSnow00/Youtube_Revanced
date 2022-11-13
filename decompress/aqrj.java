import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrj extends ahbh implements ahcw
{
    public static final aqrj a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public ahcr d;
    public ahcr e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrj.class, (ahbh)(a = new aqrj()));
    }
    
    private aqrj() {
        this.d = ahcr.a;
        this.e = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrj.f) == null) {
                    synchronized (aqrj.class) {
                        if (aqrj.f == null) {
                            aqrj.f = (ahdd)new ahba((ahbh)aqrj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrj.a;
            }
            case 4: {
                return new ahaz((byte[][][])null, (float[])null);
            }
            case 3: {
                return new aqrj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001\u1004\u0000\u00022\u00032", new Object[] { "b", "c", "d", aqrh.a, "e", aqri.a });
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
