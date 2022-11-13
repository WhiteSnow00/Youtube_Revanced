import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniw extends ahbh implements ahcw
{
    public static final aniw a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aniw.class, (ahbh)(a = new aniw()));
    }
    
    private aniw() {
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
                final ahdd b;
                if ((b = aniw.b) == null) {
                    synchronized (aniw.class) {
                        if (aniw.b == null) {
                            aniw.b = (ahdd)new ahba((ahbh)aniw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aniw.a;
            }
            case 4: {
                return new ahaz((ahbh)aniw.a);
            }
            case 3: {
                return new aniw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aniw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
