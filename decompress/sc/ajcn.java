import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcn extends ahbh implements ahcw
{
    public static final ajcn a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcn.class, (ahbh)(a = new ajcn()));
    }
    
    private ajcn() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((h = ajcn.h) == null) {
                    synchronized (ajcn.class) {
                        if (ajcn.h == null) {
                            ajcn.h = (ahdd)new ahba((ahbh)ajcn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajcn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcn.a);
            }
            case 3: {
                return new ajcn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
