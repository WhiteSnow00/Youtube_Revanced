import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcm extends ahcz implements aheo
{
    public static final aqcm a;
    private static volatile ahev d;
    public int b;
    public anwr c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqcm.class, a = new aqcm());
    }
    
    private aqcm() {
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
                if ((d = aqcm.d) == null) {
                    synchronized (aqcm.class) {
                        if (aqcm.d == null) {
                            aqcm.d = (ahev)new ahcs((ahcz)aqcm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcm.a);
            }
            case 3: {
                return new aqcm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcm.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "b", "c" });
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
