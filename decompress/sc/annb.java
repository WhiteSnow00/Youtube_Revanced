import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annb extends ahbh implements ahcw
{
    public static final annb a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahab d;
    
    static {
        ahbh.registerDefaultInstance((Class)annb.class, (ahbh)(a = new annb()));
    }
    
    private annb() {
        this.c = "";
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = annb.e) == null) {
                    synchronized (annb.class) {
                        if (annb.e == null) {
                            annb.e = (ahdd)new ahba((ahbh)annb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return annb.a;
            }
            case 4: {
                return new ahaz((ahbh)annb.a);
            }
            case 3: {
                return new annb();
            }
            case 2: {
                return newMessageInfo((MessageLite)annb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
