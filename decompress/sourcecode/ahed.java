import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahed extends agzi implements ahax
{
    public static final ahed a;
    private static volatile ahbe g;
    public ahef b;
    public String c;
    public String d;
    public boolean e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ahed.class, a = new ahed());
    }
    
    private ahed() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahed.g) == null) {
                    synchronized (ahed.class) {
                        if (ahed.g == null) {
                            ahed.g = (ahbe)new agzb((agzi)ahed.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahed.a;
            }
            case 4: {
                return new agza((agzi)ahed.a);
            }
            case 3: {
                return new ahed();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahed.a, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0007\u0007\f", new Object[] { "b", "c", "d", "e", "f" });
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
