import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfy extends ahbh implements ahcw
{
    public static final ajfy a;
    private static volatile ahdd n;
    public int b;
    public String c;
    public ahbx d;
    public ahbx e;
    public String f;
    public String g;
    public boolean h;
    public ajfv i;
    public String j;
    public ahbx k;
    public ajfx l;
    public ajfx m;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfy.class, (ahbh)(a = new ajfy()));
    }
    
    private ajfy() {
        this.c = "";
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = "";
        this.g = "";
        this.j = "";
        this.k = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = ajfy.n) == null) {
                    synchronized (ajfy.class) {
                        if (ajfy.n == null) {
                            ajfy.n = (ahdd)new ahba((ahbh)ajfy.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajfy.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (boolean[])null);
            }
            case 3: {
                return new ajfy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfy.a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u001b\u0004\u1008\u0001\u0005\u1008\u0002\u0006\u1007\u0003\b\u1009\u0005\t\u1008\u0006\f\u001b\r\u1009\t\u000e\u1009\n", new Object[] { "b", "c", "d", ajfu.class, "e", ajfs.class, "f", "g", "h", "i", "j", "k", ajfw.class, "l", "m" });
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
