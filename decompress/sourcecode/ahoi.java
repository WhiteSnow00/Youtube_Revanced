import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoi extends agzi implements ahax
{
    public static final ahoi a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(ahoi.class, a = new ahoi());
    }
    
    private ahoi() {
        this.b = agzi.emptyIntList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahoi.c) == null) {
                    synchronized (ahoi.class) {
                        if (ahoi.c == null) {
                            ahoi.c = (ahbe)new agzb((agzi)ahoi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahoi.a;
            }
            case 4: {
                return new agza((float[][])null, (int[][])null);
            }
            case 3: {
                return new ahoi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoi.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[] { "b", ahnf.a() });
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
