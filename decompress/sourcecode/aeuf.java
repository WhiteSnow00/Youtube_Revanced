import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeuf extends agzi implements ahax
{
    public static final aeuf a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aeuf.class, a = new aeuf());
    }
    
    private aeuf() {
        this.c = 5;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aeuf.e) == null) {
                    synchronized (aeuf.class) {
                        if (aeuf.e == null) {
                            aeuf.e = (ahbe)new agzb((agzi)aeuf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeuf.a;
            }
            case 4: {
                return new agza((agzi)aeuf.a);
            }
            case 3: {
                return new aeuf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeuf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aeih.f, "d", aeih.g });
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
