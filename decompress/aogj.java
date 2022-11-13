import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogj extends ahbh implements ahcw
{
    public static final aogj a;
    private static volatile ahdd e;
    public int b;
    public ajpm c;
    public String d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aogj.class, (ahbh)(a = new aogj()));
    }
    
    private aogj() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aogj.e) == null) {
                    synchronized (aogj.class) {
                        if (aogj.e == null) {
                            aogj.e = (ahdd)new ahba((ahbh)aogj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogj.a;
            }
            case 4: {
                return new ahaz((ahbh)aogj.a);
            }
            case 3: {
                return new aogj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogj.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1008\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
