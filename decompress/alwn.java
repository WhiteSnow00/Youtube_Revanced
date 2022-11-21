import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwn extends ahcz implements aheo
{
    public static final alwn a;
    private static volatile ahev d;
    public boolean b;
    public long c;
    private int e;
    private anxb f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alwn.class, a = new alwn());
    }
    
    private alwn() {
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
                if ((d = alwn.d) == null) {
                    synchronized (alwn.class) {
                        if (alwn.d == null) {
                            alwn.d = (ahev)new ahcs((ahcz)alwn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alwn.a;
            }
            case 4: {
                return new ahcr((ahcz)alwn.a);
            }
            case 3: {
                return new alwn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1003\u0002", new Object[] { "e", "b", "f", "c" });
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
