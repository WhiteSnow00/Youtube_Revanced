import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdn extends ahbh implements ahcw
{
    public static final ajdn a;
    private static volatile ahdd s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdn.class, (ahbh)(a = new ajdn()));
    }
    
    private ajdn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd s;
                if ((s = ajdn.s) == null) {
                    synchronized (ajdn.class) {
                        if (ajdn.s == null) {
                            ajdn.s = (ahdd)new ahba((ahbh)ajdn.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return ajdn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdn.a);
            }
            case 3: {
                return new ajdn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdn.a, "\u0001\u0010\u0000\u0001\u0001\u001b\u0010\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0006\u1004\u0005\u0007\u1004\u0006\r\u1004\f\u000e\u1004\r\u000f\u1004\u000e\u0010\u1004\u000f\u0013\u1004\u0012\u0014\u1004\u0013\u0015\u1004\u0017\u0018\u1004\u0014\u001a\u1004\u001a\u001b\u1004\u0015", new Object[] { "b", "c", ajdo.a(), "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o", "r", "p" });
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
