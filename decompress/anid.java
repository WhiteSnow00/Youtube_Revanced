import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anid extends ahbh implements ahcw
{
    public static final anid a;
    private static volatile ahdd b;
    private int c;
    private aicz d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anid.class, (ahbh)(a = new anid()));
    }
    
    private anid() {
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
                if ((b = anid.b) == null) {
                    synchronized (anid.class) {
                        if (anid.b == null) {
                            anid.b = (ahdd)new ahba((ahbh)anid.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anid.a;
            }
            case 4: {
                return new ahaz((ahbh)anid.a);
            }
            case 3: {
                return new anid();
            }
            case 2: {
                return newMessageInfo((MessageLite)anid.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
