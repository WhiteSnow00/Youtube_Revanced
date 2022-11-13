import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alob extends ahbh implements ahcw
{
    public static final alob a;
    private static volatile ahdd d;
    public int b;
    public aloa c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alob.class, (ahbh)(a = new alob()));
    }
    
    private alob() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alob.d) == null) {
                    synchronized (alob.class) {
                        if (alob.d == null) {
                            alob.d = (ahdd)new ahba((ahbh)alob.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alob.a;
            }
            case 4: {
                return new ahaz((ahbh)alob.a);
            }
            case 3: {
                return new alob();
            }
            case 2: {
                return newMessageInfo((MessageLite)alob.a, "\u0001\u0001\u0000\u0001\uea9e\u1ca7\uea9e\u1ca7\u0001\u0000\u0000\u0001\uea9e\u1ca7\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
