import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzx extends ahcz implements aheo
{
    public static final apzx a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public String d;
    public aisc e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apzx.class, a = new apzx());
    }
    
    private apzx() {
        this.h = 2;
        this.d = "";
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
                if ((f = apzx.f) == null) {
                    synchronized (apzx.class) {
                        if (apzx.f == null) {
                            apzx.f = (ahev)new ahcs((ahcz)apzx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apzx.a;
            }
            case 4: {
                return new ahcr((ahcz)apzx.a);
            }
            case 3: {
                return new apzx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzx.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1008\u0001\u0005\u1409\u0002", new Object[] { "b", "c", "g", "d", "e" });
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
