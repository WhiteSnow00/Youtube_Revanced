import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajzb extends agzi implements ahax
{
    public static final ajzb a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajzb a2 = new ajzb();
        agzi.registerDefaultInstance(ajzb.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 398047497, ahcm.k, ajzb.class);
    }
    
    private ajzb() {
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
                if ((c = ajzb.c) == null) {
                    synchronized (ajzb.class) {
                        if (ajzb.c == null) {
                            ajzb.c = (ahbe)new agzb((agzi)ajzb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajzb.a;
            }
            case 4: {
                return new agza((agzi)ajzb.a);
            }
            case 3: {
                return new ajzb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajzb.a, "\u0001\u0000", null);
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
