import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algy extends ahcz implements aheo
{
    public static final algy a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algy.class, a = new algy());
    }
    
    private algy() {
        this.b = 0;
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
                if ((d = algy.d) == null) {
                    synchronized (algy.class) {
                        if (algy.d == null) {
                            algy.d = (ahev)new ahcs((ahcz)algy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algy.a;
            }
            case 4: {
                return new ahcr((ahcz)algy.a);
            }
            case 3: {
                return new algy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algy.a, "\u0001\u000f\u0001\u0000\ue32b\u1bcb\ufed7\u6061\u000f\u0000\u0000\u000f\ue32b\u1bcb\u143c\u0000\ue9fd\u1dc6\u143c\u0000\uf321\u1e90\u143c\u0000\uf092\u1f0a\u143c\u0000\uf437\u1f3b\u143c\u0000\uf26a\u2912\u143c\u0000\uf88a\u2cf8\u143c\u0000\uec26\u2dd9\u143c\u0000\uefcf\u2e35\u143c\u0000\uf28f\u3c9f\u143c\u0000\ue91b\u3cbe\u143c\u0000\ue923\u4da1\u143c\u0000\ue611\u5aaf\u143c\u0000\ueb32\u5f63\u143c\u0000\ufed7\u6061\u143c\u0000", new Object[] { "c", "b", apzw.class, apzx.class, aizd.class, apzy.class, aqal.class, allh.class, amoz.class, amii.class, amhq.class, aqan.class, apcu.class, ajxo.class, alwy.class, ajhk.class, aolv.class });
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
