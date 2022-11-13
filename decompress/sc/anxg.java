import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxg extends ahbh implements ahcw
{
    public static final anxg a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)anxg.class, (ahbh)(a = new anxg()));
    }
    
    private anxg() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anxg.d) == null) {
                    synchronized (anxg.class) {
                        if (anxg.d == null) {
                            anxg.d = (ahdd)new ahba((ahbh)anxg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anxg.a;
            }
            case 4: {
                return new ahaz((ahbh)anxg.a);
            }
            case 3: {
                return new anxg();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxg.a, "\u0001\u0001\u0001\u0000\uf9c8\u4dba\uf9c8\u4dba\u0001\u0000\u0000\u0000\uf9c8\u4dba\u103c\u0000", new Object[] { "c", "b", anxk.class });
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
