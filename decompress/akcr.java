import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcr extends ahbh implements ahcw
{
    public static final akcr a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public int e;
    public long f;
    public String g;
    public String h;
    
    static {
        ahbh.registerDefaultInstance((Class)akcr.class, (ahbh)(a = new akcr()));
    }
    
    private akcr() {
        this.c = 0;
        this.g = "";
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
                if ((i = akcr.i) == null) {
                    synchronized (akcr.class) {
                        if (akcr.i == null) {
                            akcr.i = (ahdd)new ahba((ahbh)akcr.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akcr.a;
            }
            case 4: {
                return new ahaz((ahbh)akcr.a);
            }
            case 3: {
                return new akcr();
            }
            case 2: {
                return newMessageInfo((MessageLite)akcr.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "d", "c", "b", akcq.class, "e", ajym.s, "f", "g", "h" });
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
