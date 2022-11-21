import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amol extends ahcz implements aheo
{
    public static final amol a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amol.class, a = new amol());
    }
    
    private amol() {
        this.f = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = amol.b) == null) {
                    synchronized (amol.class) {
                        if (amol.b == null) {
                            amol.b = (ahev)new ahcs((ahcz)amol.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amol.a;
            }
            case 4: {
                return new ahcr((ahcz)amol.a);
            }
            case 3: {
                return new amol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amol.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
