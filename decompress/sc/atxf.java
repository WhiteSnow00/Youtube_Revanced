import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxf extends ahbh implements ahcw
{
    public static final atxf a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)atxf.class, (ahbh)(a = new atxf()));
    }
    
    private atxf() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atxf.e) == null) {
                    synchronized (atxf.class) {
                        if (atxf.e == null) {
                            atxf.e = (ahdd)new ahba((ahbh)atxf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxf.a;
            }
            case 4: {
                return new ahaz((ahbh)atxf.a);
            }
            case 3: {
                return new atxf();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1005\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
