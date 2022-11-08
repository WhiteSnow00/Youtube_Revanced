import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aota extends agzi implements ahax
{
    public static final aota a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public ajzl d;
    private byte f;
    
    static {
        final aota a2 = new aota();
        agzi.registerDefaultInstance(aota.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 249145766, ahcm.k, aota.class);
    }
    
    private aota() {
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
                final ahbe e;
                if ((e = aota.e) == null) {
                    synchronized (aota.class) {
                        if (aota.e == null) {
                            aota.e = (ahbe)new agzb((agzi)aota.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aota.a;
            }
            case 4: {
                return new agza((agzi)aota.a);
            }
            case 3: {
                return new aota();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aota.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
