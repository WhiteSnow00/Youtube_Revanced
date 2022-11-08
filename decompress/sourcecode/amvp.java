import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvp extends agzi implements ahax
{
    public static final amvp a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public aqdk d;
    public int e;
    private byte g;
    
    static {
        final amvp a2 = new amvp();
        agzi.registerDefaultInstance(amvp.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 250283977, ahcm.k, amvp.class);
    }
    
    private amvp() {
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
                if ((f = amvp.f) == null) {
                    synchronized (amvp.class) {
                        if (amvp.f == null) {
                            amvp.f = (ahbe)new agzb((agzi)amvp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amvp.a;
            }
            case 4: {
                return new agza((agzi)amvp.a);
            }
            case 3: {
                return new amvp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", ankw.a() });
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
