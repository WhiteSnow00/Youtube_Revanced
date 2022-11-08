import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amur extends agzi implements ahax
{
    public static final amur a;
    private static volatile ahbe d;
    public CommandOuterClass$Command b;
    public alts c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(amur.class, a = new amur());
    }
    
    private amur() {
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
                if ((d = amur.d) == null) {
                    synchronized (amur.class) {
                        if (amur.d == null) {
                            amur.d = (ahbe)new agzb((agzi)amur.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amur.a;
            }
            case 4: {
                return new agza((agzi)amur.a);
            }
            case 3: {
                return new amur();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amur.a, "\u0001\u0002\u0000\u0001\u0001\u03e7\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u03e7\u1409\u0001", new Object[] { "e", "b", "c" });
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
