import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anix extends ahbh implements ahcw
{
    public static final anix a;
    private static volatile ahdd b;
    private int c;
    private amgs d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anix.class, (ahbh)(a = new anix()));
    }
    
    private anix() {
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
                if ((b = anix.b) == null) {
                    synchronized (anix.class) {
                        if (anix.b == null) {
                            anix.b = (ahdd)new ahba((ahbh)anix.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anix.a;
            }
            case 4: {
                return new ahaz((ahbh)anix.a);
            }
            case 3: {
                return new anix();
            }
            case 2: {
                return newMessageInfo((MessageLite)anix.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "c", "d" });
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
