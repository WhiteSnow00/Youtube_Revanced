import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apav extends ahbh implements ahcw
{
    public static final apav a;
    private static volatile ahdd b;
    private int c;
    private apau d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apav.class, (ahbh)(a = new apav()));
    }
    
    private apav() {
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
                if ((b = apav.b) == null) {
                    synchronized (apav.class) {
                        if (apav.b == null) {
                            apav.b = (ahdd)new ahba((ahbh)apav.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apav.a;
            }
            case 4: {
                return new ahaz((ahbh)apav.a);
            }
            case 3: {
                return new apav();
            }
            case 2: {
                return newMessageInfo((MessageLite)apav.a, "\u0001\u0001\u0000\u0001\ufc44\u29e0\ufc44\u29e0\u0001\u0000\u0000\u0001\ufc44\u29e0\u1409\u0000", new Object[] { "c", "d" });
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
