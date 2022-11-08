import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcr extends agzi implements ahax
{
    public static final ajcr a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcr a2 = new ajcr();
        agzi.registerDefaultInstance(ajcr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 230793507, ahcm.k, ajcr.class);
    }
    
    private ajcr() {
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
                if ((c = ajcr.c) == null) {
                    synchronized (ajcr.class) {
                        if (ajcr.c == null) {
                            ajcr.c = (ahbe)new agzb((agzi)ajcr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcr.a;
            }
            case 4: {
                return new agza((agzi)ajcr.a);
            }
            case 3: {
                return new ajcr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcr.a, "\u0001\u0000", null);
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
