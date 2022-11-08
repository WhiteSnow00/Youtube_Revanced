import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqii extends agzi implements ahax
{
    public static final aqii a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final aqii a2 = new aqii();
        agzi.registerDefaultInstance((Class)aqii.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 336926123, ahcm.k, (Class)aqii.class);
    }
    
    private aqii() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqii.c) == null) {
                    synchronized (aqii.class) {
                        if (aqii.c == null) {
                            aqii.c = (ahbe)new agzb((agzi)aqii.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqii.a;
            }
            case 4: {
                return new agza((agzi)aqii.a);
            }
            case 3: {
                return new aqii();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqii.a, "\u0001\u0000", (Object[])null);
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
