import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alia extends ahcz implements aheo
{
    public static final alia a;
    private static volatile ahev f;
    public int b;
    public String c;
    public apry d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(alia.class, a = new alia());
    }
    
    private alia() {
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
                if ((f = alia.f) == null) {
                    synchronized (alia.class) {
                        if (alia.f == null) {
                            alia.f = (ahev)new ahcs((ahcz)alia.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alia.a;
            }
            case 4: {
                return new ahcr((int[][][])null, (boolean[][])null);
            }
            case 3: {
                return new alia();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alia.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", apry.class });
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
