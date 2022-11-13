import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajke extends ahbh implements ahcw
{
    public static final ajke a;
    private static volatile ahdd d;
    public int b;
    public ajkd c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajke.class, (ahbh)(a = new ajke()));
    }
    
    private ajke() {
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
                final ahdd d;
                if ((d = ajke.d) == null) {
                    synchronized (ajke.class) {
                        if (ajke.d == null) {
                            ajke.d = (ahdd)new ahba((ahbh)ajke.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajke.a;
            }
            case 4: {
                return new ahaz((ahbh)ajke.a);
            }
            case 3: {
                return new ajke();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajke.a, "\u0001\u0001\u0000\u0001\uee5d\u21e7\uee5d\u21e7\u0001\u0000\u0000\u0001\uee5d\u21e7\u1409\u0000", new Object[] { "b", "c" });
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
