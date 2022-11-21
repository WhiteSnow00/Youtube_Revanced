import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwb extends ahcz implements aheo
{
    public static final alwb a;
    private static volatile ahev d;
    public int b;
    public anxb c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alwb.class, a = new alwb());
    }
    
    private alwb() {
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
                if ((d = alwb.d) == null) {
                    synchronized (alwb.class) {
                        if (alwb.d == null) {
                            alwb.d = (ahev)new ahcs((ahcz)alwb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alwb.a;
            }
            case 4: {
                return new ahcr((ahcz)alwb.a);
            }
            case 3: {
                return new alwb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
