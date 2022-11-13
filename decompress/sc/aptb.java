import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptb extends ahbh implements ahcw
{
    public static final aptb a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    
    static {
        ahbh.registerDefaultInstance((Class)aptb.class, (ahbh)(a = new aptb()));
    }
    
    private aptb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aptb.i) == null) {
                    synchronized (aptb.class) {
                        if (aptb.i == null) {
                            aptb.i = (ahdd)new ahba((ahbh)aptb.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aptb.a;
            }
            case 4: {
                return new ahaz((ahbh)aptb.a);
            }
            case 3: {
                return new aptb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptb.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1007\u0001\u0003\u1004\u0004\u0004\u1004\u0005\u0005\u1004\u0000\u0006\u1002\u0003\u0007\u1007\u0006", new Object[] { "b", "d", "f", "g", "c", "e", "h" });
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
