import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aper extends agzi implements ahax
{
    public static final aper a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public int e;
    public String f;
    
    static {
        agzi.registerDefaultInstance(aper.class, a = new aper());
    }
    
    private aper() {
        this.c = "";
        this.f = "";
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
                if ((g = aper.g) == null) {
                    synchronized (aper.class) {
                        if (aper.g == null) {
                            aper.g = (ahbe)new agzb((agzi)aper.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aper.a;
            }
            case 4: {
                return new agza((agzi)aper.a);
            }
            case 3: {
                return new aper();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aper.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", apes.a(), "e", "f" });
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
