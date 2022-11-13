import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvy extends ahbh implements ahcw
{
    public static final fvy a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    
    static {
        ahbh.registerDefaultInstance((Class)fvy.class, (ahbh)(a = new fvy()));
    }
    
    private fvy() {
        this.c = "";
        this.d = "";
        this.g = -1L;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = fvy.i) == null) {
                    synchronized (fvy.class) {
                        if (fvy.i == null) {
                            fvy.i = (ahdd)new ahba((ahbh)fvy.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return fvy.a;
            }
            case 4: {
                return new ahaz((ahbh)fvy.a);
            }
            case 3: {
                return new fvy();
            }
            case 2: {
                return newMessageInfo((MessageLite)fvy.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
