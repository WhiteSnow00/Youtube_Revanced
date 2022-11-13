import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzg extends ahbh implements ahcw
{
    public static final aqzg a;
    private static volatile ahdd g;
    public int b;
    public aqxx c;
    public String d;
    public String e;
    public aqzf f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzg.class, (ahbh)(a = new aqzg()));
    }
    
    private aqzg() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqzg.g) == null) {
                    synchronized (aqzg.class) {
                        if (aqzg.g == null) {
                            aqzg.g = (ahdd)new ahba((ahbh)aqzg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqzg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqzg.a);
            }
            case 3: {
                return new aqzg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzg.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
