import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivj extends agzi implements ahax
{
    public static final aivj a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    private byte g;
    
    static {
        final aivj a2 = new aivj();
        agzi.registerDefaultInstance(aivj.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 285132689, ahcm.k, aivj.class);
    }
    
    private aivj() {
        this.g = 2;
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
                final ahbe f;
                if ((f = aivj.f) == null) {
                    synchronized (aivj.class) {
                        if (aivj.f == null) {
                            aivj.f = (ahbe)new agzb((agzi)aivj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aivj.a;
            }
            case 4: {
                return new agza((agzi)aivj.a);
            }
            case 3: {
                return new aivj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
