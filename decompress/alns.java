import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alns extends ahcz implements aheo
{
    public static final alns a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alns.class, a = new alns());
    }
    
    private alns() {
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
                if ((b = alns.b) == null) {
                    synchronized (alns.class) {
                        if (alns.b == null) {
                            alns.b = (ahev)new ahcs((ahcz)alns.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alns.a;
            }
            case 4: {
                return new ahcr((ahcz)alns.a);
            }
            case 3: {
                return new alns();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alns.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
