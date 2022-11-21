import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokb extends ahcz implements aheo
{
    public static final aokb a;
    private static volatile ahev f;
    public int b;
    public anxb c;
    public anxb d;
    public ahbt e;
    private ahjl g;
    private ahoi h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aokb.class, a = new aokb());
    }
    
    private aokb() {
        this.i = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aokb.f) == null) {
                    synchronized (aokb.class) {
                        if (aokb.f == null) {
                            aokb.f = (ahev)new ahcs((ahcz)aokb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aokb.a;
            }
            case 4: {
                return new ahcr((ahcz)aokb.a);
            }
            case 3: {
                return new aokb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aokb.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u100a\u0005\t\u1409\u0006", new Object[] { "b", "c", "d", "g", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
