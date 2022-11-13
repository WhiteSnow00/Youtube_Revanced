import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrg extends ahbh implements ahcw
{
    public static final aqrg a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrg.class, (ahbh)(a = new aqrg()));
    }
    
    private aqrg() {
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
                if ((e = aqrg.e) == null) {
                    synchronized (aqrg.class) {
                        if (aqrg.e == null) {
                            aqrg.e = (ahdd)new ahba((ahbh)aqrg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqrg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrg.a);
            }
            case 3: {
                return new aqrg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
