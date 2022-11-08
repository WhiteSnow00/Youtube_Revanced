import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajct extends agzi implements ahax
{
    public static final ajct a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajct a2 = new ajct();
        agzi.registerDefaultInstance(ajct.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 221166232, ahcm.k, ajct.class);
    }
    
    private ajct() {
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
                if ((c = ajct.c) == null) {
                    synchronized (ajct.class) {
                        if (ajct.c == null) {
                            ajct.c = (ahbe)new agzb((agzi)ajct.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajct.a;
            }
            case 4: {
                return new agza((agzi)ajct.a);
            }
            case 3: {
                return new ajct();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajct.a, "\u0001\u0000", null);
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
