import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgd extends ahbh implements ahcw
{
    public static final akgd a;
    private static volatile ahdd b;
    private int c;
    private amgs d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgd.class, (ahbh)(a = new akgd()));
    }
    
    private akgd() {
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
                final ahdd b;
                if ((b = akgd.b) == null) {
                    synchronized (akgd.class) {
                        if (akgd.b == null) {
                            akgd.b = (ahdd)new ahba((ahbh)akgd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akgd.a;
            }
            case 4: {
                return new ahaz((ahbh)akgd.a);
            }
            case 3: {
                return new akgd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgd.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "c", "d" });
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
