import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkw extends ahbh implements ahcw
{
    public static final gkw a;
    private static volatile ahdd i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;
    public boolean h;
    
    static {
        ahbh.registerDefaultInstance((Class)gkw.class, (ahbh)(a = new gkw()));
    }
    
    private gkw() {
        this.f = "APPEARANCE_SYSTEM";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = gkw.i) == null) {
                    synchronized (gkw.class) {
                        if (gkw.i == null) {
                            gkw.i = (ahdd)new ahba((ahbh)gkw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return gkw.a;
            }
            case 4: {
                return new ahaz((ahbh)gkw.a);
            }
            case 3: {
                return new gkw();
            }
            case 2: {
                return newMessageInfo((MessageLite)gkw.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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