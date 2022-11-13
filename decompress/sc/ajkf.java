import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkf extends ahbh implements ahcw
{
    public static final ajkf a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public boolean f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkf.class, (ahbh)(a = new ajkf()));
    }
    
    private ajkf() {
        this.c = 0;
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajkf.g) == null) {
                    synchronized (ajkf.class) {
                        if (ajkf.g == null) {
                            ajkf.g = (ahdd)new ahba((ahbh)ajkf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajkf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkf.a);
            }
            case 3: {
                return new ajkf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkf.a, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1007\u0002\u0005\u143c\u0000\u0006\u143c\u0000", new Object[] { "d", "c", "b", "e", "f", aiqj.class, aiyg.class });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
