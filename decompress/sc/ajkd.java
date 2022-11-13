import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkd extends ahbh implements ahcw
{
    public static final ajkd a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public String d;
    private anuv f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkd.class, (ahbh)(a = new ajkd()));
    }
    
    private ajkd() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajkd.e) == null) {
                    synchronized (ajkd.class) {
                        if (ajkd.e == null) {
                            ajkd.e = (ahdd)new ahba((ahbh)ajkd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajkd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajkd.a);
            }
            case 3: {
                return new ajkd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkd.a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1008\u0000\b\u1409\u0003", new Object[] { "b", "c", ajka.class, "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
