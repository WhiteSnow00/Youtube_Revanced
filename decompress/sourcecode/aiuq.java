import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuq extends agzi implements ahax
{
    public static final aiuq a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public long f;
    
    static {
        final aiuq a2 = new aiuq();
        agzi.registerDefaultInstance(aiuq.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 278341630, ahcm.k, aiuq.class);
    }
    
    private aiuq() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aiuq.g) == null) {
                    synchronized (aiuq.class) {
                        if (aiuq.g == null) {
                            aiuq.g = (ahbe)new agzb((agzi)aiuq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiuq.a;
            }
            case 4: {
                return new agza((agzi)aiuq.a);
            }
            case 3: {
                return new aiuq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002", new Object[] { "c", "d", "e", "f" });
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
