import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhl extends ahbh implements ahcw
{
    public static final anhl a;
    private static volatile ahdd e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)anhl.class, (ahbh)(a = new anhl()));
    }
    
    private anhl() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anhl.e) == null) {
                    synchronized (anhl.class) {
                        if (anhl.e == null) {
                            anhl.e = (ahdd)new ahba((ahbh)anhl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anhl.a;
            }
            case 4: {
                return new ahaz((ahbh)anhl.a);
            }
            case 3: {
                return new anhl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhl.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1004\u0001\u0004\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
