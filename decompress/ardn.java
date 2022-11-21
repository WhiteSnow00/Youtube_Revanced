import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardn extends ahcz implements aheo
{
    public static final ardn a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public ardo d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(ardn.class, a = new ardn());
    }
    
    private ardn() {
        this.c = ahcz.emptyProtobufList();
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
                if ((f = ardn.f) == null) {
                    synchronized (ardn.class) {
                        if (ardn.f == null) {
                            ardn.f = (ahev)new ahcs((ahcz)ardn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ardn.a;
            }
            case 4: {
                return new ahcr((int[][][])null);
            }
            case 3: {
                return new ardn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u001b", new Object[] { "b", "c", ardm.class, "d", "e", arbu.class });
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
