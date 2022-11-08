import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfk extends agzi implements ahax
{
    public static final ahfk a;
    private static volatile ahbe d;
    public int b;
    public ahfj c;
    
    static {
        agzi.registerDefaultInstance(ahfk.class, a = new ahfk());
    }
    
    private ahfk() {
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
                if ((d = ahfk.d) == null) {
                    synchronized (ahfk.class) {
                        if (ahfk.d == null) {
                            ahfk.d = (ahbe)new agzb((agzi)ahfk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahfk.a;
            }
            case 4: {
                return new agza((agzi)ahfk.a);
            }
            case 3: {
                return new ahfk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
