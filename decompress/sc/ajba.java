import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajba extends ahbh implements ahcw
{
    public static final ajba a;
    private static volatile ahdd d;
    public int b;
    public ajaz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajba.class, (ahbh)(a = new ajba()));
    }
    
    private ajba() {
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
                if ((d = ajba.d) == null) {
                    synchronized (ajba.class) {
                        if (ajba.d == null) {
                            ajba.d = (ahdd)new ahba((ahbh)ajba.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajba.a;
            }
            case 4: {
                return new ahaz((ahbh)ajba.a);
            }
            case 3: {
                return new ajba();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajba.a, "\u0001\u0001\u0000\u0001\uf252\u3d77\uf252\u3d77\u0001\u0000\u0000\u0001\uf252\u3d77\u1409\u0000", new Object[] { "b", "c" });
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
