import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcd extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final ajcd b;
    private static volatile ahdd j;
    public int c;
    public long d;
    public ahbp e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    static {
        a = (ahbq)new ptj(15);
        ahbh.registerDefaultInstance((Class)ajcd.class, (ahbh)(b = new ajcd()));
    }
    
    private ajcd() {
        this.e = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ajcd.j) == null) {
                    synchronized (ajcd.class) {
                        if (ajcd.j == null) {
                            ajcd.j = (ahdd)new ahba((ahbh)ajcd.b);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajcd.b;
            }
            case 4: {
                return new ahaz((short[][])null, (int[])null);
            }
            case 3: {
                return new ajcd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcd.b, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u1002\u0000\u0003\u001e\u0004\u1007\u0002\u0005\u1007\u0003\u0006\u1007\u0004\u0007\u1007\u0005", new Object[] { "c", "d", "e", amjk.a(), "f", "g", "h", "i" });
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
