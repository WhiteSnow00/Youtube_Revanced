import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahne extends ahcz implements aheo
{
    public static final ahne a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ahne.class, a = new ahne());
    }
    
    private ahne() {
        this.b = 0;
        this.g = 2;
        final ahbt b = ahbt.b;
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
                if ((d = ahne.d) == null) {
                    synchronized (ahne.class) {
                        if (ahne.d == null) {
                            ahne.d = (ahev)new ahcs((ahcz)ahne.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahne.a;
            }
            case 4: {
                return new ahcr((ahcz)ahne.a);
            }
            case 3: {
                return new ahne();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahne.a, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001\u103d\u0000\u0006\u1409\u0002\t\u103b\u0000", new Object[] { "c", "b", "e", "f" });
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
