import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajva extends ahbh implements ahcw
{
    public static final ajva a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public String d;
    public aiqj e;
    public boolean f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajva.class, (ahbh)(a = new ajva()));
    }
    
    private ajva() {
        this.h = 2;
        this.d = "";
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
                if ((g = ajva.g) == null) {
                    synchronized (ajva.class) {
                        if (ajva.g == null) {
                            ajva.g = (ahdd)new ahba((ahbh)ajva.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajva.a;
            }
            case 4: {
                return new ahaz((ahbh)ajva.a);
            }
            case 3: {
                return new ajva();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajva.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1008\u0001\u0004\u1409\u0003\u0005\u1007\u0004", new Object[] { "b", "c", akjo.q, "d", "e", "f" });
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
