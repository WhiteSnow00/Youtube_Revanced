import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrf extends ahbh implements ahcw
{
    public static final aqrf a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrf.class, (ahbh)(a = new aqrf()));
    }
    
    private aqrf() {
        this.c = 1;
        this.d = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqrf.e) == null) {
                    synchronized (aqrf.class) {
                        if (aqrf.e == null) {
                            aqrf.e = (ahdd)new ahba((ahbh)aqrf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqrf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrf.a);
            }
            case 3: {
                return new aqrf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "b", "c", aqls.n, "d" });
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
