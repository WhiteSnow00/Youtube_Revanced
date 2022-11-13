import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpn extends ahbh implements ahcw
{
    public static final akpn a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ajut d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akpn.class, (ahbh)(a = new akpn()));
    }
    
    private akpn() {
        this.g = 2;
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
                if ((e = akpn.e) == null) {
                    synchronized (akpn.class) {
                        if (akpn.e == null) {
                            akpn.e = (ahdd)new ahba((ahbh)akpn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpn.a;
            }
            case 4: {
                return new ahaz((ahbh)akpn.a);
            }
            case 3: {
                return new akpn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpn.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", akjo.o, "c", "d" });
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
