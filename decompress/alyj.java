import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyj extends ahcz implements aheo
{
    public static final alyj a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(alyj.class, a = new alyj());
    }
    
    private alyj() {
        this.c = "";
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
                if ((f = alyj.f) == null) {
                    synchronized (alyj.class) {
                        if (alyj.f == null) {
                            alyj.f = (ahev)new ahcs((ahcz)alyj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alyj.a;
            }
            case 4: {
                return new ahcr((boolean[][])null, (float[])null);
            }
            case 3: {
                return new alyj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", alyg.class });
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
