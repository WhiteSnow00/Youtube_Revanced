import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfs extends ahbh implements ahcw
{
    public static final ajfs a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfs.class, (ahbh)(a = new ajfs()));
    }
    
    private ajfs() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajfs.f) == null) {
                    synchronized (ajfs.class) {
                        if (ajfs.f == null) {
                            ajfs.f = (ahdd)new ahba((ahbh)ajfs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajfs.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfs.a);
            }
            case 3: {
                return new ajfs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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