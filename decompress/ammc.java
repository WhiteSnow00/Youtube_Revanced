import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammc extends ahcz implements aheo
{
    public static final ammc a;
    private static volatile ahev d;
    public ahdp b;
    public int c;
    private int e;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ammc.class, a = new ammc());
    }
    
    private ammc() {
        this.g = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ammc.d) == null) {
                    synchronized (ammc.class) {
                        if (ammc.d == null) {
                            ammc.d = (ahev)new ahcs((ahcz)ammc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammc.a;
            }
            case 4: {
                return new ahcr((ahcz)ammc.a);
            }
            case 3: {
                return new ammc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", ammb.class, "f", "c", amgw.r });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
