import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcq extends agzi implements ahax
{
    public static final ajcq a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcq a2 = new ajcq();
        agzi.registerDefaultInstance(ajcq.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 427304386, ahcm.k, ajcq.class);
    }
    
    private ajcq() {
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
                if ((c = ajcq.c) == null) {
                    synchronized (ajcq.class) {
                        if (ajcq.c == null) {
                            ajcq.c = (ahbe)new agzb((agzi)ajcq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcq.a;
            }
            case 4: {
                return new agza((agzi)ajcq.a);
            }
            case 3: {
                return new ajcq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcq.a, "\u0001\u0000", null);
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
