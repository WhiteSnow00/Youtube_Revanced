import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsf extends agzi implements ahax
{
    public static final alsf a;
    private static volatile ahbe h;
    public int b;
    public double c;
    public boolean d;
    public boolean e;
    public double f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(alsf.class, a = new alsf());
    }
    
    private alsf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = alsf.h) == null) {
                    synchronized (alsf.class) {
                        if (alsf.h == null) {
                            alsf.h = (ahbe)new agzb((agzi)alsf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alsf.a;
            }
            case 4: {
                return new agza((agzi)alsf.a);
            }
            case 3: {
                return new alsf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsf.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1007\u0001\u0006\u1007\u0002\u0007\u1000\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g" });
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
