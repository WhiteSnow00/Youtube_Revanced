import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampa extends ahcz implements aheo
{
    public static final ampa a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ampa.class, a = new ampa());
    }
    
    private ampa() {
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
                final ahev b;
                if ((b = ampa.b) == null) {
                    synchronized (ampa.class) {
                        if (ampa.b == null) {
                            ampa.b = (ahev)new ahcs((ahcz)ampa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampa.a;
            }
            case 4: {
                return new ahcr((ahcz)ampa.a);
            }
            case 3: {
                return new ampa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampa.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0004\u0006\u1409\u0002", new Object[] { "c", "d", "f", "e" });
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
