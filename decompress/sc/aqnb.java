import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqnb extends ahbh implements ahcw
{
    public static final aqnb a;
    private static volatile ahdd h;
    public int b;
    public double c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqnb.class, (ahbh)(a = new aqnb()));
    }
    
    private aqnb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aqnb.h) == null) {
                    synchronized (aqnb.class) {
                        if (aqnb.h == null) {
                            aqnb.h = (ahdd)new ahba((ahbh)aqnb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqnb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqnb.a);
            }
            case 3: {
                return new aqnb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqnb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1007\u0001\u0003\u100b\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
