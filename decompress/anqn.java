import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqn extends ahbh implements ahcw
{
    public static final anqn a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anqn.class, (ahbh)(a = new anqn()));
    }
    
    private anqn() {
        this.b = 0;
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
                if ((d = anqn.d) == null) {
                    synchronized (anqn.class) {
                        if (anqn.d == null) {
                            anqn.d = (ahdd)new ahba((ahbh)anqn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anqn.a;
            }
            case 4: {
                return new ahaz((ahbh)anqn.a);
            }
            case 3: {
                return new anqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqn.a, "\u0001\u0003\u0001\u0000\uff43\u1dfd\ue862\u4b1e\u0003\u0000\u0000\u0003\uff43\u1dfd\u143c\u0000\ueb11\u1f11\u143c\u0000\ue862\u4b1e\u143c\u0000", new Object[] { "c", "b", anqq.class, aicz.class, ahlc.class });
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
