import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdw extends ahbh implements ahcw
{
    public static final ajdw a;
    private static volatile ahdd c;
    public ajdv b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdw.class, (ahbh)(a = new ajdw()));
    }
    
    private ajdw() {
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
                if ((c = ajdw.c) == null) {
                    synchronized (ajdw.class) {
                        if (ajdw.c == null) {
                            ajdw.c = (ahdd)new ahba((ahbh)ajdw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajdw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdw.a);
            }
            case 3: {
                return new ajdw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdw.a, "\u0001\u0001\u0000\u0001\ue719\u2d5e\ue719\u2d5e\u0001\u0000\u0000\u0001\ue719\u2d5e\u1409\u0000", new Object[] { "d", "b" });
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
