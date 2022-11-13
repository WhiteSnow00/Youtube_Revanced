import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqy extends ahbh implements ahcw
{
    public static final afqy a;
    private static volatile ahdd l;
    public int b;
    public afrb c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    
    static {
        ahbh.registerDefaultInstance((Class)afqy.class, (ahbh)(a = new afqy()));
    }
    
    private afqy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = afqy.l) == null) {
                    synchronized (afqy.class) {
                        if (afqy.l == null) {
                            afqy.l = (ahdd)new ahba((ahbh)afqy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return afqy.a;
            }
            case 4: {
                return new ahaz((ahbh)afqy.a);
            }
            case 3: {
                return new afqy();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqy.a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1005\u0002\u0007\u1004\u0006\b\u1004\u0007\u000b\u1004\n\f\u1007\u000b\r\u1004\f\u000e\u1004\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
