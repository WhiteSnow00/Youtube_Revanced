import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkm extends ahbh implements ahcw
{
    public static final aqkm a;
    private static volatile ahdd c;
    public aqko b;
    private int d;
    private aqjh e;
    private aqhx f;
    private aqii g;
    private aqjz h;
    private aqib i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkm.class, (ahbh)(a = new aqkm()));
    }
    
    private aqkm() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqkm.c) == null) {
                    synchronized (aqkm.class) {
                        if (aqkm.c == null) {
                            aqkm.c = (ahdd)new ahba((ahbh)aqkm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqkm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkm.a);
            }
            case 3: {
                return new aqkm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkm.a, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\n\u1409\n\u000e\u1409\u000b\u000f\u1409\f", new Object[] { "d", "b", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
