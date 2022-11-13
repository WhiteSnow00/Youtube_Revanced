import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzf extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final aqzf b;
    private static volatile ahdd f;
    public int c;
    public int d;
    public ahbp e;
    
    static {
        a = (ahbq)new alvv(18);
        ahbh.registerDefaultInstance((Class)aqzf.class, (ahbh)(b = new aqzf()));
    }
    
    private aqzf() {
        this.e = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqzf.f) == null) {
                    synchronized (aqzf.class) {
                        if (aqzf.f == null) {
                            aqzf.f = (ahdd)new ahba((ahbh)aqzf.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqzf.b;
            }
            case 4: {
                return new ahaz((byte[][])null, (short[])null);
            }
            case 3: {
                return new aqzf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzf.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", aqzh.a(), "e", aqzh.a() });
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
