import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvs extends agzi implements ahax
{
    public static final ajvs a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajvs a2 = new ajvs();
        agzi.registerDefaultInstance(ajvs.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqdp.a, a2, (MessageLite)a2, null, 346458203, ahcm.k, ajvs.class);
    }
    
    private ajvs() {
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
                if ((c = ajvs.c) == null) {
                    synchronized (ajvs.class) {
                        if (ajvs.c == null) {
                            ajvs.c = (ahbe)new agzb((agzi)ajvs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajvs.a;
            }
            case 4: {
                return new agza((agzi)ajvs.a);
            }
            case 3: {
                return new ajvs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvs.a, "\u0001\u0000", null);
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
