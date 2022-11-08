import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqih extends agzi implements ahax
{
    public static final aqih a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public String d;
    
    static {
        final aqih a2 = new aqih();
        agzi.registerDefaultInstance((Class)aqih.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 360463768, ahcm.k, (Class)aqih.class);
    }
    
    private aqih() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqih.e) == null) {
                    synchronized (aqih.class) {
                        if (aqih.e == null) {
                            aqih.e = (ahbe)new agzb((agzi)aqih.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqih.a;
            }
            case 4: {
                return new agza((agzi)aqih.a);
            }
            case 3: {
                return new aqih();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqih.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
