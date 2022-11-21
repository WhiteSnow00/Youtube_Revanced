import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amob extends ahcz implements aheo
{
    public static final amob a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(amob.class, a = new amob());
    }
    
    private amob() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = amob.c) == null) {
                    synchronized (amob.class) {
                        if (amob.c == null) {
                            amob.c = (ahev)new ahcs((ahcz)amob.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amob.a;
            }
            case 4: {
                return new ahcr((ahcz)amob.a);
            }
            case 3: {
                return new amob();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amob.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anxb.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
