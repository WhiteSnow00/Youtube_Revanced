import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoif extends ahcz implements aheo
{
    public static final aoif a;
    private static volatile ahev d;
    public aowb b;
    public ajws c;
    private int e;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aoif.class, a = new aoif());
    }
    
    private aoif() {
        this.g = 2;
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
                if ((d = aoif.d) == null) {
                    synchronized (aoif.class) {
                        if (aoif.d == null) {
                            aoif.d = (ahev)new ahcs((ahcz)aoif.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoif.a;
            }
            case 4: {
                return new ahcr((ahcz)aoif.a);
            }
            case 3: {
                return new aoif();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoif.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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
