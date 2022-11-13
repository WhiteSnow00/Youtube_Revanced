import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnv extends ahbh implements ahcw
{
    public static final alnv a;
    private static volatile ahdd g;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)alnv.class, (ahbh)(a = new alnv()));
    }
    
    private alnv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = alnv.g) == null) {
                    synchronized (alnv.class) {
                        if (alnv.g == null) {
                            alnv.g = (ahdd)new ahba((ahbh)alnv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alnv.a;
            }
            case 4: {
                return new ahaz((ahbh)alnv.a);
            }
            case 3: {
                return new alnv();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnv.a, "\u0001\u0005\u0000\u0001\u0001\u0015\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0006\u1007\u0005\f\u1007\n\u000f\u1007\r\u0015\u1007\u0011", new Object[] { "h", "b", "c", "d", "e", "f" });
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
