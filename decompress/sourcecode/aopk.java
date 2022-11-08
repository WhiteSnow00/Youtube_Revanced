import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopk extends agzi implements ahax
{
    public static final aopk a;
    public static final agzg b;
    private static volatile ahbe f;
    public String c;
    public String d;
    public aopm e;
    private int g;
    
    static {
        final aopk a2 = new aopk();
        agzi.registerDefaultInstance((Class)aopk.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 228172556, ahcm.k, (Class)aopk.class);
    }
    
    private aopk() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aopk.f) == null) {
                    synchronized (aopk.class) {
                        if (aopk.f == null) {
                            aopk.f = (ahbe)new agzb((agzi)aopk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aopk.a;
            }
            case 4: {
                return new agza((agzi)aopk.a);
            }
            case 3: {
                return new aopk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopk.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", new Object[] { "g", "c", "d", "e" });
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
