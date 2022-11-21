import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkm extends ahcz implements aheo
{
    public static final amkm a;
    private static volatile ahev d;
    public int b;
    public aisc c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amkm.class, a = new amkm());
    }
    
    private amkm() {
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
                final ahev d;
                if ((d = amkm.d) == null) {
                    synchronized (amkm.class) {
                        if (amkm.d == null) {
                            amkm.d = (ahev)new ahcs((ahcz)amkm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkm.a;
            }
            case 4: {
                return new ahcr((ahcz)amkm.a);
            }
            case 3: {
                return new amkm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "e", "b", anep.h, "c" });
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
