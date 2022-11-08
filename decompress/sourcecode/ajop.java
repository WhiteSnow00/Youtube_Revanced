import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajop extends agzi implements ahax
{
    public static final ajop a;
    public static final agzg b;
    private static volatile ahbe d;
    public boolean c;
    private int e;
    
    static {
        final ajop a2 = new ajop();
        agzi.registerDefaultInstance((Class)ajop.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 394017097, ahcm.k, (Class)ajop.class);
    }
    
    private ajop() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajop.d) == null) {
                    synchronized (ajop.class) {
                        if (ajop.d == null) {
                            ajop.d = (ahbe)new agzb((agzi)ajop.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajop.a;
            }
            case 4: {
                return new agza((agzi)ajop.a);
            }
            case 3: {
                return new ajop();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajop.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "e", "c" });
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
