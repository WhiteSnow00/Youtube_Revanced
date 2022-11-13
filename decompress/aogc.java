import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogc extends ahbh implements ahcw
{
    public static final aogc a;
    private static volatile ahdd e;
    public ahcr b;
    public String c;
    public aiqj d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aogc.class, (ahbh)(a = new aogc()));
    }
    
    private aogc() {
        this.b = ahcr.a;
        this.g = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aogc.e) == null) {
                    synchronized (aogc.class) {
                        if (aogc.e == null) {
                            aogc.e = (ahdd)new ahba((ahbh)aogc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogc.a;
            }
            case 4: {
                return new ahaz((ahbh)aogc.a);
            }
            case 3: {
                return new aogc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u00012\u0002\u1008\u0000\u0003\u1409\u0001", new Object[] { "f", "b", aogb.a, "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
