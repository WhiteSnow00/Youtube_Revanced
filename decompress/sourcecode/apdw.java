import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdw extends agzi implements ahax
{
    public static final apdw a;
    public static final agzg b;
    private static volatile ahbe d;
    public akzy c;
    private int e;
    private byte f;
    
    static {
        final apdw a2 = new apdw();
        agzi.registerDefaultInstance(apdw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 382524576, ahcm.k, apdw.class);
    }
    
    private apdw() {
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
                if ((d = apdw.d) == null) {
                    synchronized (apdw.class) {
                        if (apdw.d == null) {
                            apdw.d = (ahbe)new agzb((agzi)apdw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdw.a;
            }
            case 4: {
                return new agza((agzi)apdw.a);
            }
            case 3: {
                return new apdw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
