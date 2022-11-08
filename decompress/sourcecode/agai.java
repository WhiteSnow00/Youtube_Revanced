import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agai extends agzi implements ahax
{
    public static final agai a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agai.class, a = new agai());
    }
    
    private agai() {
        this.c = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agai.d) == null) {
                    synchronized (agai.class) {
                        if (agai.d == null) {
                            agai.d = (ahbe)new agzb((agzi)agai.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agai.a;
            }
            case 4: {
                return new agza((agzi)agai.a);
            }
            case 3: {
                return new agai();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agai.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "b", "c" });
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
