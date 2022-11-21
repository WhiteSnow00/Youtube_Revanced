import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammo extends ahcz implements aheo
{
    public static final ammo a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ammo.class, a = new ammo());
    }
    
    private ammo() {
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
                if ((d = ammo.d) == null) {
                    synchronized (ammo.class) {
                        if (ammo.d == null) {
                            ammo.d = (ahev)new ahcs((ahcz)ammo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammo.a;
            }
            case 4: {
                return new ahcr((ahcz)ammo.a);
            }
            case 3: {
                return new ammo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammo.a, "\u0001\u0005\u0001\u0000\ueb11\u1f11\ufc56\uab1f\u0005\u0000\u0000\u0004\ueb11\u1f11\u143c\u0000\ufd0c\u399c\u143c\u0000\uebde\u9991\u143c\u0000\ue123\u9dbf\u103c\u0000\ufc56\uab1f\u143c\u0000", new Object[] { "c", "b", aies.class, amnu.class, aoxv.class, aoxw.class, akfd.class });
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
