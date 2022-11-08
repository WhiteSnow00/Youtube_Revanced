import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aium extends agzi implements ahax
{
    public static final aium a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final aium a2 = new aium();
        agzi.registerDefaultInstance(aium.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 289084567, ahcm.k, aium.class);
    }
    
    private aium() {
        this.c = "";
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
                if ((d = aium.d) == null) {
                    synchronized (aium.class) {
                        if (aium.d == null) {
                            aium.d = (ahbe)new agzb((agzi)aium.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aium.a;
            }
            case 4: {
                return new agza((agzi)aium.a);
            }
            case 3: {
                return new aium();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aium.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
