import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abzw extends ahbh implements ahcw
{
    public static final abzw a;
    private static volatile ahdd i;
    public int b;
    public abzx c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    
    static {
        ahbh.registerDefaultInstance((Class)abzw.class, (ahbh)(a = new abzw()));
    }
    
    private abzw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = abzw.i) == null) {
                    synchronized (abzw.class) {
                        if (abzw.i == null) {
                            abzw.i = (ahdd)new ahba((ahbh)abzw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return abzw.a;
            }
            case 4: {
                return new ahaz((ahbh)abzw.a);
            }
            case 3: {
                return new abzw();
            }
            case 2: {
                return newMessageInfo((MessageLite)abzw.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0007\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", pff.m });
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
