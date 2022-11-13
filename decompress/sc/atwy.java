import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwy extends ahbh implements ahcw
{
    public static final atwy a;
    private static volatile ahdd k;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    
    static {
        ahbh.registerDefaultInstance((Class)atwy.class, (ahbh)(a = new atwy()));
    }
    
    private atwy() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = atwy.k) == null) {
                    synchronized (atwy.class) {
                        if (atwy.k == null) {
                            atwy.k = (ahdd)new ahba((ahbh)atwy.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return atwy.a;
            }
            case 4: {
                return new ahaz((ahbh)atwy.a);
            }
            case 3: {
                return new atwy();
            }
            case 2: {
                return newMessageInfo((MessageLite)atwy.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", areg.e, "e", "f", areg.d, "g", "h", "i", "j" });
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
