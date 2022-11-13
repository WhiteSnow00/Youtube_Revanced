import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anak extends ahbh implements ahcw
{
    public static final anak a;
    private static volatile ahdd c;
    public alfs b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anak.class, (ahbh)(a = new anak()));
    }
    
    private anak() {
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
                final ahdd c;
                if ((c = anak.c) == null) {
                    synchronized (anak.class) {
                        if (anak.c == null) {
                            anak.c = (ahdd)new ahba((ahbh)anak.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anak.a;
            }
            case 4: {
                return new ahaz((ahbh)anak.a);
            }
            case 3: {
                return new anak();
            }
            case 2: {
                return newMessageInfo((MessageLite)anak.a, "\u0001\u0001\u0000\u0001\ue697\u3b15\ue697\u3b15\u0001\u0000\u0000\u0001\ue697\u3b15\u1409\u0000", new Object[] { "d", "b" });
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
