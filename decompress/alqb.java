import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqb extends ahcz implements aheo
{
    public static final alqb a;
    private static volatile ahev d;
    public int b;
    public alqa c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alqb.class, a = new alqb());
    }
    
    private alqb() {
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
                if ((d = alqb.d) == null) {
                    synchronized (alqb.class) {
                        if (alqb.d == null) {
                            alqb.d = (ahev)new ahcs((ahcz)alqb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqb.a;
            }
            case 4: {
                return new ahcr((ahcz)alqb.a);
            }
            case 3: {
                return new alqb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqb.a, "\u0001\u0001\u0000\u0001\uea9e\u1ca7\uea9e\u1ca7\u0001\u0000\u0000\u0001\uea9e\u1ca7\u1409\u0000", new Object[] { "b", "c" });
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
