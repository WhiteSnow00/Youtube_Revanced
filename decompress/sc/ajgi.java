import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgi extends ahbh implements ahcw
{
    public static final ajgi a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public ahbx d;
    public ajfu e;
    public boolean f;
    public int g;
    public String h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajgi.class, (ahbh)(a = new ajgi()));
    }
    
    private ajgi() {
        this.c = "";
        this.d = emptyProtobufList();
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = ajgi.i) == null) {
                    synchronized (ajgi.class) {
                        if (ajgi.i == null) {
                            ajgi.i = (ahdd)new ahba((ahbh)ajgi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajgi.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgi.a);
            }
            case 3: {
                return new ajgi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgi.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u1007\u0002\u0005\u100c\u0003\u0006\u1008\u0004", new Object[] { "b", "c", "d", ajfu.class, "e", "f", "g", ajgj.a(), "h" });
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
