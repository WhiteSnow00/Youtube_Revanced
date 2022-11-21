import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlf extends ahcz implements aheo
{
    public static final amlf a;
    private static volatile ahev g;
    public int b;
    public anxb c;
    public ajws d;
    public ahdp e;
    public int f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amlf.class, a = new amlf());
    }
    
    private amlf() {
        this.h = 2;
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
                final ahev g;
                if ((g = amlf.g) == null) {
                    synchronized (amlf.class) {
                        if (amlf.g == null) {
                            amlf.g = (ahev)new ahcs((ahcz)amlf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amlf.a;
            }
            case 4: {
                return new ahcr((ahcz)amlf.a);
            }
            case 3: {
                return new amlf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002", new Object[] { "b", "c", "d", "e", anxb.class, "f" });
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
