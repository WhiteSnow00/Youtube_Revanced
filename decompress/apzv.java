import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzv extends ahcz implements aheo
{
    public static final apzv a;
    private static volatile ahev g;
    public aowb b;
    public ajws c;
    public ajws d;
    public ajws e;
    public ahbt f;
    private int h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apzv.class, a = new apzv());
    }
    
    private apzv() {
        this.j = 2;
        this.f = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apzv.g) == null) {
                    synchronized (apzv.class) {
                        if (apzv.g == null) {
                            apzv.g = (ahev)new ahcs((ahcz)apzv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apzv.a;
            }
            case 4: {
                return new ahcr((ahcz)apzv.a);
            }
            case 3: {
                return new apzv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "h", "b", "c", "d", "e", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
