import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqir extends ahcz implements aheo
{
    public static final aqir a;
    private static volatile ahev k;
    public int b;
    public float c;
    public float d;
    public aqii e;
    public aqjz f;
    public int g;
    public int h;
    public boolean i;
    public aqij j;
    
    static {
        ahcz.registerDefaultInstance(aqir.class, a = new aqir());
    }
    
    private aqir() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aqir.k) == null) {
                    synchronized (aqir.class) {
                        if (aqir.k == null) {
                            aqir.k = (ahev)new ahcs((ahcz)aqir.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aqir.a;
            }
            case 4: {
                return new ahcr((ahcz)aqir.a);
            }
            case 3: {
                return new aqir();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqir.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u1007\u0006\b\u1009\u0007", new Object[] { "b", "c", "d", "e", "f", "g", aqdx.p, "h", aqdx.o, "i", "j" });
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
