import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrb extends ahcz implements aheo
{
    public static final akrb a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public int d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akrb.class, a = new akrb());
    }
    
    private akrb() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akrb.e) == null) {
                    synchronized (akrb.class) {
                        if (akrb.e == null) {
                            akrb.e = (ahev)new ahcs((ahcz)akrb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akrb.a;
            }
            case 4: {
                return new ahcr((ahcz)akrb.a);
            }
            case 3: {
                return new akrb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrb.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "b", "c", "d", aidb.h });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
