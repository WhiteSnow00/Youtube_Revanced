import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxc extends ahbh implements ahcw
{
    public static final akxc a;
    private static volatile ahdd d;
    public int b;
    public anej c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akxc.class, (ahbh)(a = new akxc()));
    }
    
    private akxc() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akxc.d) == null) {
                    synchronized (akxc.class) {
                        if (akxc.d == null) {
                            akxc.d = (ahdd)new ahba((ahbh)akxc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akxc.a;
            }
            case 4: {
                return new ahaz((ahbh)akxc.a);
            }
            case 3: {
                return new akxc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxc.a, "\u0001\u0001\u0000\u0001\ue9a3\u3e92\ue9a3\u3e92\u0001\u0000\u0000\u0001\ue9a3\u3e92\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
