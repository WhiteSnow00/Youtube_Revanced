import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnb extends ahcz implements aheo
{
    public static final amnb a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnb.class, a = new amnb());
    }
    
    private amnb() {
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
                if ((d = amnb.d) == null) {
                    synchronized (amnb.class) {
                        if (amnb.d == null) {
                            amnb.d = (ahev)new ahcs((ahcz)amnb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnb.a;
            }
            case 4: {
                return new ahcr((ahcz)amnb.a);
            }
            case 3: {
                return new amnb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnb.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aies.class });
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
