import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apon extends ahcz implements aheo
{
    public static final apon a;
    private static volatile ahev f;
    public String b;
    public String c;
    public ajws d;
    public ahdp e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apon.class, a = new apon());
    }
    
    private apon() {
        this.h = 2;
        this.b = "";
        this.c = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((f = apon.f) == null) {
                    synchronized (apon.class) {
                        if (apon.f == null) {
                            apon.f = (ahev)new ahcs((ahcz)apon.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apon.a;
            }
            case 4: {
                return new ahcr((ahcz)apon.a);
            }
            case 3: {
                return new apon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apon.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u001a\u0004\u1008\u0001", new Object[] { "g", "b", "d", "e", "c" });
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
