import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojt extends ahcz implements aheo
{
    public static final aojt a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public int d;
    public String e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aojt.class, a = new aojt());
    }
    
    private aojt() {
        this.g = 2;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aojt.f) == null) {
                    synchronized (aojt.class) {
                        if (aojt.f == null) {
                            aojt.f = (ahev)new ahcs((ahcz)aojt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojt.a;
            }
            case 4: {
                return new ahcr((ahcz)aojt.a);
            }
            case 3: {
                return new aojt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", aoha.k, "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
