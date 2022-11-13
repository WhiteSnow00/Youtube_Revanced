import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldw extends ahbh implements ahcw
{
    public static final aldw a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aldw.class, (ahbh)(a = new aldw()));
    }
    
    private aldw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aldw.e) == null) {
                    synchronized (aldw.class) {
                        if (aldw.e == null) {
                            aldw.e = (ahdd)new ahba((ahbh)aldw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aldw.a;
            }
            case 4: {
                return new ahaz((ahbh)aldw.a);
            }
            case 3: {
                return new aldw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
