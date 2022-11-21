import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyh extends ahcz implements aheo
{
    public static final alyh a;
    private static volatile ahev f;
    public int b;
    public String c;
    public ahdp d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(alyh.class, a = new alyh());
    }
    
    private alyh() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alyh.f) == null) {
                    synchronized (alyh.class) {
                        if (alyh.f == null) {
                            alyh.f = (ahev)new ahcs((ahcz)alyh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alyh.a;
            }
            case 4: {
                return new ahcr((ahcz)alyh.a);
            }
            case 3: {
                return new alyh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u001b", new Object[] { "b", "c", "d", alyg.class, "e", alyi.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
