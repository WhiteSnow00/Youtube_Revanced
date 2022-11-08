import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcw extends agzi implements ahax
{
    public static final ajcw a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcw a2 = new ajcw();
        agzi.registerDefaultInstance(ajcw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 206634270, ahcm.k, ajcw.class);
    }
    
    private ajcw() {
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
                if ((c = ajcw.c) == null) {
                    synchronized (ajcw.class) {
                        if (ajcw.c == null) {
                            ajcw.c = (ahbe)new agzb((agzi)ajcw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcw.a;
            }
            case 4: {
                return new agza((agzi)ajcw.a);
            }
            case 3: {
                return new ajcw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcw.a, "\u0001\u0000", null);
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
