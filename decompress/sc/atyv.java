import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyv extends ahbh implements ahcw
{
    public static final atyv a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbs d;
    
    static {
        ahbh.registerDefaultInstance((Class)atyv.class, (ahbh)(a = new atyv()));
    }
    
    private atyv() {
        this.c = "";
        this.d = emptyLongList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atyv.e) == null) {
                    synchronized (atyv.class) {
                        if (atyv.e == null) {
                            atyv.e = (ahdd)new ahba((ahbh)atyv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atyv.a;
            }
            case 4: {
                return new ahaz((int[])null, (boolean[])null);
            }
            case 3: {
                return new atyv();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyv.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0003(", new Object[] { "b", "c", "d" });
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
