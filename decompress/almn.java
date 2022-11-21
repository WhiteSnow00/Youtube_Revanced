import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almn extends ahcz implements aheo
{
    public static final almn a;
    private static volatile ahev g;
    public int b;
    public String c;
    public ahbt d;
    public ahdp e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(almn.class, a = new almn());
    }
    
    private almn() {
        this.c = "";
        this.d = ahbt.b;
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
                final ahev g;
                if ((g = almn.g) == null) {
                    synchronized (almn.class) {
                        if (almn.g == null) {
                            almn.g = (ahev)new ahcs((ahcz)almn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return almn.a;
            }
            case 4: {
                return new ahcr((ahcz)almn.a);
            }
            case 3: {
                return new almn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almn.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u001a\u0005\u1002\u0002", new Object[] { "b", "c", "d", "e", "f" });
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
