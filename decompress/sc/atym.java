import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atym extends ahbh implements ahcw
{
    public static final atym a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public String g;
    
    static {
        ahbh.registerDefaultInstance((Class)atym.class, (ahbh)(a = new atym()));
    }
    
    private atym() {
        this.c = "";
        this.d = "";
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
                if ((h = atym.h) == null) {
                    synchronized (atym.class) {
                        if (atym.h == null) {
                            atym.h = (ahdd)new ahba((ahbh)atym.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return atym.a;
            }
            case 4: {
                return new ahaz((ahbh)atym.a);
            }
            case 3: {
                return new atym();
            }
            case 2: {
                return newMessageInfo((MessageLite)atym.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", areg.q, "f", "g" });
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
