import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfs extends ahcz implements aheo
{
    public static final alfs a;
    private static volatile ahev d;
    public aknj b;
    public boolean c;
    private int e;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alfs.class, a = new alfs());
    }
    
    private alfs() {
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
                if ((d = alfs.d) == null) {
                    synchronized (alfs.class) {
                        if (alfs.d == null) {
                            alfs.d = (ahev)new ahcs((ahcz)alfs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfs.a;
            }
            case 4: {
                return new ahcr((ahcz)alfs.a);
            }
            case 3: {
                return new alfs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfs.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0309\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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
