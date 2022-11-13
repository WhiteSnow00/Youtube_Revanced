import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolj extends ahbh implements ahcw
{
    public static final aolj a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aolj.class, (ahbh)(a = new aolj()));
    }
    
    private aolj() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aolj.e) == null) {
                    synchronized (aolj.class) {
                        if (aolj.e == null) {
                            aolj.e = (ahdd)new ahba((ahbh)aolj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aolj.a;
            }
            case 4: {
                return new ahaz((ahbh)aolj.a);
            }
            case 3: {
                return new aolj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
