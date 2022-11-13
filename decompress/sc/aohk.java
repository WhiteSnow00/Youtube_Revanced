import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohk extends ahbh implements ahcw
{
    public static final aohk a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public int d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aohk.class, (ahbh)(a = new aohk()));
    }
    
    private aohk() {
        this.g = 2;
        this.e = "";
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
                final ahdd f;
                if ((f = aohk.f) == null) {
                    synchronized (aohk.class) {
                        if (aohk.f == null) {
                            aohk.f = (ahdd)new ahba((ahbh)aohk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aohk.a;
            }
            case 4: {
                return new ahaz((ahbh)aohk.a);
            }
            case 3: {
                return new aohk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", aoet.j, "e" });
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
