import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqfa extends agzi implements ahax
{
    public static final aqfa a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public agyc d;
    private int f;
    
    static {
        final aqfa a2 = new aqfa();
        agzi.registerDefaultInstance((Class)aqfa.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 170382760, ahcm.k, (Class)aqfa.class);
    }
    
    private aqfa() {
        this.c = "";
        this.d = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqfa.e) == null) {
                    synchronized (aqfa.class) {
                        if (aqfa.e == null) {
                            aqfa.e = (ahbe)new agzb((agzi)aqfa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqfa.a;
            }
            case 4: {
                return new agza((agzi)aqfa.a);
            }
            case 3: {
                return new aqfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "f", "c", "d" });
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
