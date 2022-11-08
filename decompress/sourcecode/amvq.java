import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvq extends agzi implements ahax
{
    public static final amvq a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public aioe e;
    private byte g;
    
    static {
        final amvq a2 = new amvq();
        agzi.registerDefaultInstance(amvq.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 428788994, ahcm.k, amvq.class);
    }
    
    private amvq() {
        this.g = 2;
        this.d = "";
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
                if ((f = amvq.f) == null) {
                    synchronized (amvq.class) {
                        if (amvq.f == null) {
                            amvq.f = (ahbe)new agzb((agzi)amvq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amvq.a;
            }
            case 4: {
                return new agza((agzi)amvq.a);
            }
            case 3: {
                return new amvq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
