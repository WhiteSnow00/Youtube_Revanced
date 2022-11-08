import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvy extends agzi implements ahax
{
    public static final ajvy a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    
    static {
        final ajvy a2 = new ajvy();
        agzi.registerDefaultInstance(ajvy.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 409926433, ahcm.k, ajvy.class);
    }
    
    private ajvy() {
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajvy.d) == null) {
                    synchronized (ajvy.class) {
                        if (ajvy.d == null) {
                            ajvy.d = (ahbe)new agzb((agzi)ajvy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvy.a;
            }
            case 4: {
                return new agza((agzi)ajvy.a);
            }
            case 3: {
                return new ajvy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "c", apft.class });
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
