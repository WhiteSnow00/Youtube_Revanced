import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptv extends ahcz implements aheo
{
    public static final aptv a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public aisc d;
    public ahdp e;
    public aptz f;
    public ahbt g;
    private ajws i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aptv.class, a = new aptv());
    }
    
    private aptv() {
        this.k = 2;
        this.e = ahcz.emptyProtobufList();
        this.g = ahbt.b;
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
                if ((h = aptv.h) == null) {
                    synchronized (aptv.class) {
                        if (aptv.h == null) {
                            aptv.h = (ahev)new ahcs((ahcz)aptv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aptv.a;
            }
            case 4: {
                return new ahcr((ahcz)aptv.a);
            }
            case 3: {
                return new aptv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptv.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u100a\u0007", new Object[] { "b", "c", "d", "e", aptu.class, "f", "i", "j", "g" });
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
