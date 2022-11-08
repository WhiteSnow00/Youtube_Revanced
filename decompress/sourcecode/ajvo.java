import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvo extends agzi implements ahax
{
    public static final ajvo a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajvo a2 = new ajvo();
        agzi.registerDefaultInstance(ajvo.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqdp.a, a2, (MessageLite)a2, null, 346458202, ahcm.k, ajvo.class);
    }
    
    private ajvo() {
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
                if ((c = ajvo.c) == null) {
                    synchronized (ajvo.class) {
                        if (ajvo.c == null) {
                            ajvo.c = (ahbe)new agzb((agzi)ajvo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajvo.a;
            }
            case 4: {
                return new agza((agzi)ajvo.a);
            }
            case 3: {
                return new ajvo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvo.a, "\u0001\u0000", null);
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
