import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andc extends ahbh implements ahcw
{
    public static final andc a;
    private static volatile ahdd k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public andb f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    
    static {
        ahbh.registerDefaultInstance((Class)andc.class, (ahbh)(a = new andc()));
    }
    
    private andc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = andc.k) == null) {
                    synchronized (andc.class) {
                        if (andc.k == null) {
                            andc.k = (ahdd)new ahba((ahbh)andc.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return andc.a;
            }
            case 4: {
                return new ahaz((ahbh)andc.a);
            }
            case 3: {
                return new andc();
            }
            case 2: {
                return newMessageInfo((MessageLite)andc.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u1007\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g", andg.a(), "h", anci.e, "i", "j" });
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
