import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyu extends ahcz implements aheo
{
    public static final akyu a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyu.class, a = new akyu());
    }
    
    private akyu() {
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
                if ((d = akyu.d) == null) {
                    synchronized (akyu.class) {
                        if (akyu.d == null) {
                            akyu.d = (ahev)new ahcs((ahcz)akyu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyu.a;
            }
            case 4: {
                return new ahcr((ahcz)akyu.a);
            }
            case 3: {
                return new akyu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyu.a, "\u0001\u0003\u0001\u0000\ue528\u1ce2\ue18f\u3ee5\u0003\u0000\u0000\u0003\ue528\u1ce2\u143c\u0000\ueb11\u1f11\u143c\u0000\ue18f\u3ee5\u143c\u0000", new Object[] { "c", "b", amzj.class, aies.class, amxf.class });
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
