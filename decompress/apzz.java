import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzz extends ahcz implements aheo
{
    public static final apzz a;
    private static volatile ahev e;
    public int b;
    public apzt c;
    public apzu d;
    private apzs f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apzz.class, a = new apzz());
    }
    
    private apzz() {
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
                final ahev e;
                if ((e = apzz.e) == null) {
                    synchronized (apzz.class) {
                        if (apzz.e == null) {
                            apzz.e = (ahev)new ahcs((ahcz)apzz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzz.a;
            }
            case 4: {
                return new ahcr((ahcz)apzz.a);
            }
            case 3: {
                return new apzz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzz.a, "\u0001\u0003\u0000\u0001\ueb52\u20e2\uf4cb\u2644\u0003\u0000\u0000\u0003\ueb52\u20e2\u1409\u0001\uf374\u20f1\u1409\u0000\uf4cb\u2644\u1409\u0002", new Object[] { "b", "d", "c", "f" });
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
