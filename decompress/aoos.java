import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoos extends ahcz implements aheo
{
    public static final aoos a;
    private static volatile ahev e;
    public int b;
    public ajhc c;
    public aoor d;
    private anan f;
    private apzo g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aoos.class, a = new aoos());
    }
    
    private aoos() {
        this.h = 2;
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
                final ahev e;
                if ((e = aoos.e) == null) {
                    synchronized (aoos.class) {
                        if (aoos.e == null) {
                            aoos.e = (ahev)new ahcs((ahcz)aoos.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoos.a;
            }
            case 4: {
                return new ahcr((ahcz)aoos.a);
            }
            case 3: {
                return new aoos();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoos.a, "\u0001\u0004\u0000\u0001\ufc43\u196f\uf39a\u1f17\u0004\u0000\u0000\u0004\ufc43\u196f\u1409\u0002\ue5d9\u1a6d\u1409\u0000\uf875\u1be7\u1409\u0001\uf39a\u1f17\u1409\u0003", new Object[] { "b", "c", "f", "g", "d" });
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
