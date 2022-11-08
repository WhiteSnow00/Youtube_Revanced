import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwr extends agzi implements ahax
{
    public static final agzr a;
    public static final ahwr b;
    private static volatile ahbe g;
    public int c;
    public agzq d;
    public int e;
    public int f;
    
    static {
        a = (agzr)new prz(11);
        agzi.registerDefaultInstance(ahwr.class, b = new ahwr());
    }
    
    private ahwr() {
        this.d = agzi.emptyIntList();
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
                if ((g = ahwr.g) == null) {
                    synchronized (ahwr.class) {
                        if (ahwr.g == null) {
                            ahwr.g = (ahbe)new agzb((agzi)ahwr.b);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahwr.b;
            }
            case 4: {
                return new agza((agzi)ahwr.b);
            }
            case 3: {
                return new ahwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwr.b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002\u1004\u0000\u0003\u1004\u0001", new Object[] { "c", "d", ahwj.a(), "e", "f" });
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
