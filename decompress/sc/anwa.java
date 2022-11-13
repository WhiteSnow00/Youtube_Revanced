import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwa extends ahbh implements ahcw
{
    public static final anwa a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anwa.class, (ahbh)(a = new anwa()));
    }
    
    private anwa() {
        this.b = 0;
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
                if ((d = anwa.d) == null) {
                    synchronized (anwa.class) {
                        if (anwa.d == null) {
                            anwa.d = (ahdd)new ahba((ahbh)anwa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwa.a;
            }
            case 4: {
                return new ahaz((ahbh)anwa.a);
            }
            case 3: {
                return new anwa();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwa.a, "\u0001\u0003\u0001\u0000\ue2d9\u1a6d\ueaaa\u1fae\u0003\u0000\u0000\u0003\ue2d9\u1a6d\u143c\u0000\ueb11\u1f11\u143c\u0000\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", aome.class, aicz.class, amgs.class });
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
