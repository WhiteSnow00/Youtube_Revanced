import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgm extends ahbh implements ahcw
{
    private static final ajgm a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajgm.class, (ahbh)(a = new ajgm()));
    }
    
    private ajgm() {
    }
    
    public static ajgl a() {
        return (ajgl)ajgm.a.createBuilder();
    }
    
    static ajgm b() {
        return ajgm.a;
    }
    
    public static void c(final ajgm ajgm, final boolean b) {
        ajgm.d(b);
    }
    
    private void d(final boolean d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajgm.b) == null) {
                    synchronized (ajgm.class) {
                        if (ajgm.b == null) {
                            ajgm.b = (ahdd)new ahba((ahbh)ajgm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajgm.a;
            }
            case 4: {
                return new ajgl();
            }
            case 3: {
                return new ajgm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
