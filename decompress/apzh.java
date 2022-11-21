import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzh extends ahcz implements aheo
{
    public static final apzh a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public ajws d;
    public ahdp e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apzh.class, a = new apzh());
    }
    
    private apzh() {
        this.h = 2;
        this.e = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apzh.f) == null) {
                    synchronized (apzh.class) {
                        if (apzh.f == null) {
                            apzh.f = (ahev)new ahcs((ahcz)apzh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apzh.a;
            }
            case 4: {
                return new ahcr((ahcz)apzh.a);
            }
            case 3: {
                return new apzh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzh.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001\u1007\u0000\u0002\u1409\u0001\u0004\u041b\u0005\u1409\u0002", new Object[] { "b", "c", "d", "e", apzk.class, "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
