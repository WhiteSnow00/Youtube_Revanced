import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzl extends ahcz implements aheo
{
    public static final apzl a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public ahdp d;
    public apzr e;
    public ahbt f;
    public aiet g;
    private apzi i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apzl.class, a = new apzl());
    }
    
    private apzl() {
        this.k = 2;
        this.d = ahcz.emptyProtobufList();
        this.f = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = apzl.h) == null) {
                    synchronized (apzl.class) {
                        if (apzl.h == null) {
                            apzl.h = (ahev)new ahcs((ahcz)apzl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apzl.a;
            }
            case 4: {
                return new ahcr((ahcz)apzl.a);
            }
            case 3: {
                return new apzl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzl.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u041b\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0006\b\u1409\u0001", new Object[] { "b", "c", "d", ajws.class, "i", "j", "f", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
