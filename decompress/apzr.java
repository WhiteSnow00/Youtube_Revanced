import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzr extends ahcz implements aheo
{
    public static final apzr a;
    private static volatile ahev d;
    public int b;
    public apzq c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzr.class, a = new apzr());
    }
    
    private apzr() {
        this.e = 2;
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
                final ahev d;
                if ((d = apzr.d) == null) {
                    synchronized (apzr.class) {
                        if (apzr.d == null) {
                            apzr.d = (ahev)new ahcs((ahcz)apzr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzr.a;
            }
            case 4: {
                return new ahcr((ahcz)apzr.a);
            }
            case 3: {
                return new apzr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzr.a, "\u0001\u0001\u0000\u0001\uf957\u3625\uf957\u3625\u0001\u0000\u0000\u0001\uf957\u3625\u1409\u0000", new Object[] { "b", "c" });
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
