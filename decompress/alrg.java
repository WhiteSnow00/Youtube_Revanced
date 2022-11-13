import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrg extends ahbh implements ahcw
{
    public static final alrg a;
    private static volatile ahdd d;
    public int b;
    public alsn c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrg.class, (ahbh)(a = new alrg()));
    }
    
    private alrg() {
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
                if ((d = alrg.d) == null) {
                    synchronized (alrg.class) {
                        if (alrg.d == null) {
                            alrg.d = (ahdd)new ahba((ahbh)alrg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrg.a;
            }
            case 4: {
                return new ahaz((ahbh)alrg.a);
            }
            case 3: {
                return new alrg();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrg.a, "\u0001\u0001\u0000\u0001\ue202\u39d6\ue202\u39d6\u0001\u0000\u0000\u0001\ue202\u39d6\u1409\u0000", new Object[] { "b", "c" });
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
