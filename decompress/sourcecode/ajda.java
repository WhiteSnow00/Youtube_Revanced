import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajda extends agzi implements ahax
{
    public static final ajda a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    private int e;
    private aioe f;
    private byte g;
    
    static {
        final ajda a2 = new ajda();
        agzi.registerDefaultInstance(ajda.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 167732284, ahcm.k, ajda.class);
    }
    
    private ajda() {
        this.g = 2;
        emptyProtobufList();
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajda.d) == null) {
                    synchronized (ajda.class) {
                        if (ajda.d == null) {
                            ajda.d = (ahbe)new agzb((agzi)ajda.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajda.a;
            }
            case 4: {
                return new agza((agzi)ajda.a);
            }
            case 3: {
                return new ajda();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajda.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u041b", new Object[] { "e", "f", "c", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
