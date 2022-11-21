import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfj extends ahcz implements aheo
{
    public static final alfj a;
    private static volatile ahev d;
    public aknj b;
    public anxb c;
    private int e;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alfj.class, a = new alfj());
    }
    
    private alfj() {
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
                if ((d = alfj.d) == null) {
                    synchronized (alfj.class) {
                        if (alfj.d == null) {
                            alfj.d = (ahev)new ahcs((ahcz)alfj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfj.a;
            }
            case 4: {
                return new ahcr((ahcz)alfj.a);
            }
            case 3: {
                return new alfj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfj.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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
