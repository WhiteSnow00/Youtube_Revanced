import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apus extends ahcz implements aheo
{
    public static final apus a;
    private static volatile ahev b;
    private int c;
    private apur d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apus.class, a = new apus());
    }
    
    private apus() {
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
                final ahev b;
                if ((b = apus.b) == null) {
                    synchronized (apus.class) {
                        if (apus.b == null) {
                            apus.b = (ahev)new ahcs((ahcz)apus.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apus.a;
            }
            case 4: {
                return new ahcr((ahcz)apus.a);
            }
            case 3: {
                return new apus();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apus.a, "\u0001\u0001\u0000\u0001\uf9ad\u4129\uf9ad\u4129\u0001\u0000\u0000\u0001\uf9ad\u4129\u1409\u0000", new Object[] { "c", "d" });
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
