import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akej extends ahbh implements ahcw
{
    public static final akej a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akej.class, (ahbh)(a = new akej()));
    }
    
    private akej() {
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
                if ((d = akej.d) == null) {
                    synchronized (akej.class) {
                        if (akej.d == null) {
                            akej.d = (ahdd)new ahba((ahbh)akej.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akej.a;
            }
            case 4: {
                return new ahaz((ahbh)akej.a);
            }
            case 3: {
                return new akej();
            }
            case 2: {
                return newMessageInfo((MessageLite)akej.a, "\u0001\u0003\u0001\u0000\ufa6a\u3fc8\uf0da\u64f6\u0003\u0000\u0000\u0003\ufa6a\u3fc8\u143c\u0000\ueb76\u4aae\u143c\u0000\uf0da\u64f6\u143c\u0000", new Object[] { "c", "b", ahuw.class, aiqa.class, ajmt.class });
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
