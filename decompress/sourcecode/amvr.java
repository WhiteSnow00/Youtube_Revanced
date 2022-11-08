import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvr extends agzi implements ahax
{
    public static final amvr a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public boolean d;
    public int e;
    public aioe f;
    private byte h;
    
    static {
        final amvr a2 = new amvr();
        agzi.registerDefaultInstance(amvr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 356868596, ahcm.k, amvr.class);
    }
    
    private amvr() {
        this.h = 2;
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
                final ahbe g;
                if ((g = amvr.g) == null) {
                    synchronized (amvr.class) {
                        if (amvr.g == null) {
                            amvr.g = (ahbe)new agzb((agzi)amvr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amvr.a;
            }
            case 4: {
                return new agza((agzi)amvr.a);
            }
            case 3: {
                return new amvr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
