import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjb extends ahcz implements aheo
{
    public static final apjb a;
    private static volatile ahev f;
    public ajws b;
    public ajws c;
    public aowb d;
    public boolean e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apjb.class, a = new apjb());
    }
    
    private apjb() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apjb.f) == null) {
                    synchronized (apjb.class) {
                        if (apjb.f == null) {
                            apjb.f = (ahev)new ahcs((ahcz)apjb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjb.a;
            }
            case 4: {
                return new ahcr((ahcz)apjb.a);
            }
            case 3: {
                return new apjb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
