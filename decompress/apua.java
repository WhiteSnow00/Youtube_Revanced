import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apua extends ahcz implements aheo
{
    public static final apua a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public aowb d;
    public aisc e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apua.class, a = new apua());
    }
    
    private apua() {
        this.h = 2;
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
                if ((f = apua.f) == null) {
                    synchronized (apua.class) {
                        if (apua.f == null) {
                            apua.f = (ahev)new ahcs((ahcz)apua.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apua.a;
            }
            case 4: {
                return new ahcr((ahcz)apua.a);
            }
            case 3: {
                return new apua();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apua.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
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
