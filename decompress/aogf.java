import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogf extends ahbh implements ahcw
{
    public static final aogf a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)aogf.class, (ahbh)(a = new aogf()));
    }
    
    private aogf() {
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
                if ((e = aogf.e) == null) {
                    synchronized (aogf.class) {
                        if (aogf.e == null) {
                            aogf.e = (ahdd)new ahba((ahbh)aogf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogf.a;
            }
            case 4: {
                return new ahaz((ahbh)aogf.a);
            }
            case 3: {
                return new aogf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
