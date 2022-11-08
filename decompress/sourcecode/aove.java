import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aove extends agzi implements ahax
{
    public static final aove a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public int d;
    private int f;
    
    static {
        final aove a2 = new aove();
        agzi.registerDefaultInstance(aove.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 476972423, ahcm.k, aove.class);
    }
    
    private aove() {
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
                final ahbe e;
                if ((e = aove.e) == null) {
                    synchronized (aove.class) {
                        if (aove.e == null) {
                            aove.e = (ahbe)new agzb((agzi)aove.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aove.a;
            }
            case 4: {
                return new agza((agzi)aove.a);
            }
            case 3: {
                return new aove();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aove.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "f", "c", "d" });
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
