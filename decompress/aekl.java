import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekl extends ahcz implements aheo
{
    public static final aekl a;
    private static volatile ahev k;
    public int b;
    public int c;
    public int d;
    public int e;
    public ahdp f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    
    static {
        ahcz.registerDefaultInstance(aekl.class, a = new aekl());
    }
    
    private aekl() {
        this.f = ahcz.emptyProtobufList();
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
                if ((k = aekl.k) == null) {
                    synchronized (aekl.class) {
                        if (aekl.k == null) {
                            aekl.k = (ahev)new ahcs((ahcz)aekl.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aekl.a;
            }
            case 4: {
                return new ahcr((ahcz)aekl.a);
            }
            case 3: {
                return new aekl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aekl.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u001a\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1007\u0005\b\u1004\u0006", new Object[] { "b", "c", "d", "e", aemb.b, "f", "g", "h", "i", "j" });
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
