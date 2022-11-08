import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainh extends agzi implements ahax
{
    public static final ainh a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public int d;
    
    static {
        final ainh a2 = new ainh();
        agzi.registerDefaultInstance(ainh.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 273756508, ahcm.k, ainh.class);
    }
    
    private ainh() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ainh.e) == null) {
                    synchronized (ainh.class) {
                        if (ainh.e == null) {
                            ainh.e = (ahbe)new agzb((agzi)ainh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ainh.a;
            }
            case 4: {
                return new agza((agzi)ainh.a);
            }
            case 3: {
                return new ainh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", ankw.a() });
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
