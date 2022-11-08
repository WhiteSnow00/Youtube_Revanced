import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altf extends agzi implements ahax
{
    public static final altf a;
    private static volatile ahbe f;
    public int b;
    public double c;
    public double d;
    public double e;
    
    static {
        agzi.registerDefaultInstance(altf.class, a = new altf());
    }
    
    private altf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = altf.f) == null) {
                    synchronized (altf.class) {
                        if (altf.f == null) {
                            altf.f = (ahbe)new agzb((agzi)altf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return altf.a;
            }
            case 4: {
                return new agza((agzi)altf.a);
            }
            case 3: {
                return new altf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)altf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1000\u0002", new Object[] { "b", "c", "d", "e" });
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
