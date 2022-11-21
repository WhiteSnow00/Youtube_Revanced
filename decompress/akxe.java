import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxe extends ahcz implements aheo
{
    public static final akxe a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akxe.class, a = new akxe());
    }
    
    private akxe() {
        this.e = 2;
        emptyProtobufList();
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
                final ahev c;
                if ((c = akxe.c) == null) {
                    synchronized (akxe.class) {
                        if (akxe.c == null) {
                            akxe.c = (ahev)new ahcs((ahcz)akxe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akxe.a;
            }
            case 4: {
                return new ahcr((ahcz)akxe.a);
            }
            case 3: {
                return new akxe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
