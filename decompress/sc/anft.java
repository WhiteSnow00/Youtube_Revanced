import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anft extends ahbh implements ahcw
{
    public static final anft a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ahab d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anft.class, (ahbh)(a = new anft()));
    }
    
    private anft() {
        this.g = 2;
        this.d = ahab.b;
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
                if ((e = anft.e) == null) {
                    synchronized (anft.class) {
                        if (anft.e == null) {
                            anft.e = (ahdd)new ahba((ahbh)anft.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anft.a;
            }
            case 4: {
                return new ahaz((ahbh)anft.a);
            }
            case 3: {
                return new anft();
            }
            case 2: {
                return newMessageInfo((MessageLite)anft.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "f", "d" });
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
