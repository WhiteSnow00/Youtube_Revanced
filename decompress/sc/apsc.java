import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsc extends ahbh implements ahcw
{
    public static final apsc a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)apsc.class, (ahbh)(a = new apsc()));
    }
    
    private apsc() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apsc.d) == null) {
                    synchronized (apsc.class) {
                        if (apsc.d == null) {
                            apsc.d = (ahdd)new ahba((ahbh)apsc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsc.a;
            }
            case 4: {
                return new ahaz((ahbh)apsc.a);
            }
            case 3: {
                return new apsc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsc.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0000", new Object[] { "b", "c" });
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
