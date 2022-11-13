import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptj extends ahbh implements ahcw
{
    public static final aptj a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)aptj.class, (ahbh)(a = new aptj()));
    }
    
    private aptj() {
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
                if ((d = aptj.d) == null) {
                    synchronized (aptj.class) {
                        if (aptj.d == null) {
                            aptj.d = (ahdd)new ahba((ahbh)aptj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptj.a;
            }
            case 4: {
                return new ahaz((ahbh)aptj.a);
            }
            case 3: {
                return new aptj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptj.a, "\u0001\u0007\u0001\u0000\u0001\u0012\u0007\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\u000e\u103c\u0000\u0012\u103c\u0000", new Object[] { "c", "b", aptq.class, apti.class, apts.class, apto.class, aptw.class, aptr.class, apth.class });
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
