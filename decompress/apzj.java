import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzj extends ahcz implements aheo
{
    public static final apzj a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public apzg d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apzj.class, a = new apzj());
    }
    
    private apzj() {
        this.f = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apzj.e) == null) {
                    synchronized (apzj.class) {
                        if (apzj.e == null) {
                            apzj.e = (ahev)new ahcs((ahcz)apzj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzj.a;
            }
            case 4: {
                return new ahcr((ahcz)apzj.a);
            }
            case 3: {
                return new apzj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzj.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0000", new Object[] { "b", "c", apzk.class, "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
