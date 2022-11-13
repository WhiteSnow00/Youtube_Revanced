import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxw extends ahbh implements ahcw
{
    public static final atxw a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)atxw.class, (ahbh)(a = new atxw()));
    }
    
    private atxw() {
        this.c = -1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atxw.d) == null) {
                    synchronized (atxw.class) {
                        if (atxw.d == null) {
                            atxw.d = (ahdd)new ahba((ahbh)atxw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atxw.a;
            }
            case 4: {
                return new ahaz((ahbh)atxw.a);
            }
            case 3: {
                return new atxw();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", atxv.a() });
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
