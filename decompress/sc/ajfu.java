import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfu extends ahbh implements ahcw
{
    public static final ajfu a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    public boolean g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfu.class, (ahbh)(a = new ajfu()));
    }
    
    private ajfu() {
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajfu.h) == null) {
                    synchronized (ajfu.class) {
                        if (ajfu.h == null) {
                            ajfu.h = (ahdd)new ahba((ahbh)ajfu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajfu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfu.a);
            }
            case 3: {
                return new ajfu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", amwz.a(), "e", "f", amwq.a(), "g" });
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
