import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwo extends ahbh implements ahcw
{
    public static final akwo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)akwo.class, (ahbh)(a = new akwo()));
    }
    
    private akwo() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akwo.d) == null) {
                    synchronized (akwo.class) {
                        if (akwo.d == null) {
                            akwo.d = (ahdd)new ahba((ahbh)akwo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwo.a;
            }
            case 4: {
                return new ahaz((ahbh)akwo.a);
            }
            case 3: {
                return new akwo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwo.a, "\u0001\u0005\u0001\u0000\uf096\u1c97\ufa7b\u3dcc\u0005\u0000\u0000\u0000\uf096\u1c97\u103c\u0000\ufe19\u1e2d\u103c\u0000\uf24e\u1e33\u103c\u0000\uf1b4\u2976\u103c\u0000\ufa7b\u3dcc\u103c\u0000", new Object[] { "c", "b", andx.class, andu.class, andv.class, andt.class, andw.class });
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
