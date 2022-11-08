import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotr extends agzi implements ahax
{
    public static final aotr a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public boolean d;
    public int e;
    public int f;
    
    static {
        final aotr a2 = new aotr();
        agzi.registerDefaultInstance(aotr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqeu.a, a2, (MessageLite)a2, null, 307697168, ahcm.k, aotr.class);
    }
    
    private aotr() {
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
                if ((g = aotr.g) == null) {
                    synchronized (aotr.class) {
                        if (aotr.g == null) {
                            aotr.g = (ahbe)new agzb((agzi)aotr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aotr.a;
            }
            case 4: {
                return new agza((agzi)aotr.a);
            }
            case 3: {
                return new aotr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "c", "d", "e", "f" });
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
