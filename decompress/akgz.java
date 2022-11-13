import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgz extends ahbh implements ahcw
{
    public static final akgz a;
    private static volatile ahdd d;
    public int b;
    public anyv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgz.class, (ahbh)(a = new akgz()));
    }
    
    private akgz() {
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
                if ((d = akgz.d) == null) {
                    synchronized (akgz.class) {
                        if (akgz.d == null) {
                            akgz.d = (ahdd)new ahba((ahbh)akgz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgz.a;
            }
            case 4: {
                return new ahaz((ahbh)akgz.a);
            }
            case 3: {
                return new akgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgz.a, "\u0001\u0001\u0000\u0001\ue7f5\u178e\ue7f5\u178e\u0001\u0000\u0000\u0001\ue7f5\u178e\u1409\u0000", new Object[] { "b", "c" });
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
