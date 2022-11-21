import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzb extends ahcz implements aheo
{
    public static final apzb a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzb.class, a = new apzb());
    }
    
    private apzb() {
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
                if ((d = apzb.d) == null) {
                    synchronized (apzb.class) {
                        if (apzb.d == null) {
                            apzb.d = (ahev)new ahcs((ahcz)apzb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzb.a;
            }
            case 4: {
                return new ahcr((ahcz)apzb.a);
            }
            case 3: {
                return new apzb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzb.a, "\u0001\u0002\u0001\u0000\ufff8\u2557\uff9f\u2da1\u0002\u0000\u0000\u0001\ufff8\u2557\u143c\u0000\uff9f\u2da1\u103c\u0000", new Object[] { "c", "b", apzd.class, apzc.class });
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
