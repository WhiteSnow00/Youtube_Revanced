import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbi extends ahbh implements ahcw
{
    public static final anbi a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public anbj d;
    private anbh f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anbi.class, (ahbh)(a = new anbi()));
    }
    
    private anbi() {
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
                if ((e = anbi.e) == null) {
                    synchronized (anbi.class) {
                        if (anbi.e == null) {
                            anbi.e = (ahdd)new ahba((ahbh)anbi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anbi.a;
            }
            case 4: {
                return new ahaz((ahbh)anbi.a);
            }
            case 3: {
                return new anbi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbi.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\u1007\u0000\u0003\u1409\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "f", "d" });
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
