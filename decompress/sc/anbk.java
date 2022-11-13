import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbk extends ahbh implements ahcw
{
    public static final anbk a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public anbl i;
    public anbl j;
    public boolean k;
    
    static {
        ahbh.registerDefaultInstance((Class)anbk.class, (ahbh)(a = new anbk()));
    }
    
    private anbk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = anbk.l) == null) {
                    synchronized (anbk.class) {
                        if (anbk.l == null) {
                            anbk.l = (ahdd)new ahba((ahbh)anbk.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return anbk.a;
            }
            case 4: {
                return new ahaz((ahbh)anbk.a);
            }
            case 3: {
                return new anbk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbk.a, "\u0001\t\u0000\u0001\u0001\u0013\t\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0005\u0003\u1004\u0001\u0007\u1004\u0004\b\u1007\t\u000b\u1009\u000b\f\u1009\f\u0012\u1007\n\u0013\u1007\u0011", new Object[] { "b", "c", "f", "d", "e", "g", "i", "j", "h", "k" });
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
