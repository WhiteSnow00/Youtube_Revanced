import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnr extends ahbh implements ahcw
{
    public static final alnr a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public aiqj d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alnr.class, (ahbh)(a = new alnr()));
    }
    
    private alnr() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = alnr.e) == null) {
                    synchronized (alnr.class) {
                        if (alnr.e == null) {
                            alnr.e = (ahdd)new ahba((ahbh)alnr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alnr.a;
            }
            case 4: {
                return new ahaz((ahbh)alnr.a);
            }
            case 3: {
                return new alnr();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
