import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcs extends agzi implements ahax
{
    public static final ajcs a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcs a2 = new ajcs();
        agzi.registerDefaultInstance(ajcs.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 234870342, ahcm.k, ajcs.class);
    }
    
    private ajcs() {
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
                if ((c = ajcs.c) == null) {
                    synchronized (ajcs.class) {
                        if (ajcs.c == null) {
                            ajcs.c = (ahbe)new agzb((agzi)ajcs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcs.a;
            }
            case 4: {
                return new agza((agzi)ajcs.a);
            }
            case 3: {
                return new ajcs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcs.a, "\u0001\u0000", null);
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
