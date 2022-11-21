import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiy extends ahcz implements aheo
{
    public static final amiy a;
    private static volatile ahev d;
    public int b;
    public amiv c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amiy.class, a = new amiy());
    }
    
    private amiy() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amiy.d) == null) {
                    synchronized (amiy.class) {
                        if (amiy.d == null) {
                            amiy.d = (ahev)new ahcs((ahcz)amiy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amiy.a;
            }
            case 4: {
                return new ahcr((ahcz)amiy.a);
            }
            case 3: {
                return new amiy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amiy.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "b", "c" });
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
