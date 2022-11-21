import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aked extends ahcz implements aheo
{
    public static final aked a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aked.class, a = new aked());
    }
    
    private aked() {
        this.b = 0;
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
                if ((d = aked.d) == null) {
                    synchronized (aked.class) {
                        if (aked.d == null) {
                            aked.d = (ahev)new ahcs((ahcz)aked.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aked.a;
            }
            case 4: {
                return new ahcr((ahcz)aked.a);
            }
            case 3: {
                return new aked();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aked.a, "\u0001\u0003\u0001\u0000\ue2d9\u1a6d\ueaaa\u1fae\u0003\u0000\u0000\u0003\ue2d9\u1a6d\u143c\u0000\ueb11\u1f11\u143c\u0000\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", aooo.class, aies.class, amiv.class });
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
