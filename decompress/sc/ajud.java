import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajud extends ahbh implements ahcw
{
    public static final ajud a;
    private static volatile ahdd h;
    public int b;
    public long c;
    public int d;
    public long e;
    public long f;
    public String g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajud.class, (ahbh)(a = new ajud()));
    }
    
    private ajud() {
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajud.h) == null) {
                    synchronized (ajud.class) {
                        if (ajud.h == null) {
                            ajud.h = (ahdd)new ahba((ahbh)ajud.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajud.a;
            }
            case 4: {
                return new ahaz((ahbh)ajud.a);
            }
            case 3: {
                return new ajud();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajud.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0002\u0003\u1002\u0003\u0004\u100c\u0001\u0005\u1008\u0004", new Object[] { "b", "c", "e", "f", "d", ajty.d, "g" });
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
