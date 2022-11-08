import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcv extends agzi implements ahax
{
    public static final ajcv a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcv a2 = new ajcv();
        agzi.registerDefaultInstance(ajcv.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 396717750, ahcm.k, ajcv.class);
    }
    
    private ajcv() {
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
                if ((c = ajcv.c) == null) {
                    synchronized (ajcv.class) {
                        if (ajcv.c == null) {
                            ajcv.c = (ahbe)new agzb((agzi)ajcv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcv.a;
            }
            case 4: {
                return new agza((agzi)ajcv.a);
            }
            case 3: {
                return new ajcv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcv.a, "\u0001\u0000", null);
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
