import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdv extends agzi implements ahax
{
    public static final apdv a;
    public static final agzg b;
    private static volatile ahbe d;
    public akzw c;
    private int e;
    private byte f;
    
    static {
        final apdv a2 = new apdv();
        agzi.registerDefaultInstance(apdv.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 466908575, ahcm.k, apdv.class);
    }
    
    private apdv() {
        this.f = 2;
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
                if ((d = apdv.d) == null) {
                    synchronized (apdv.class) {
                        if (apdv.d == null) {
                            apdv.d = (ahbe)new agzb((agzi)apdv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdv.a;
            }
            case 4: {
                return new agza((agzi)apdv.a);
            }
            case 3: {
                return new apdv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
