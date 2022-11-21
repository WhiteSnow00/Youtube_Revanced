import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzc extends ahcz implements aheo
{
    public static final akzc a;
    private static volatile ahev d;
    public int b;
    public angq c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzc.class, a = new akzc());
    }
    
    private akzc() {
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
                if ((d = akzc.d) == null) {
                    synchronized (akzc.class) {
                        if (akzc.d == null) {
                            akzc.d = (ahev)new ahcs((ahcz)akzc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzc.a;
            }
            case 4: {
                return new ahcr((ahcz)akzc.a);
            }
            case 3: {
                return new akzc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzc.a, "\u0001\u0001\u0000\u0001\ue9a3\u3e92\ue9a3\u3e92\u0001\u0000\u0000\u0001\ue9a3\u3e92\u1409\u0000", new Object[] { "b", "c" });
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
