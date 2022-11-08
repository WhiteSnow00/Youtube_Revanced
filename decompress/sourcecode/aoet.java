import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoet extends agzi implements ahax
{
    public static final aoet a;
    public static final agzg b;
    private static volatile ahbe d;
    public aoeu c;
    private int e;
    private byte f;
    
    static {
        final aoet a2 = new aoet();
        agzi.registerDefaultInstance(aoet.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 137739979, ahcm.k, aoet.class);
    }
    
    private aoet() {
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
                if ((d = aoet.d) == null) {
                    synchronized (aoet.class) {
                        if (aoet.d == null) {
                            aoet.d = (ahbe)new agzb((agzi)aoet.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoet.a;
            }
            case 4: {
                return new agza((agzi)aoet.a);
            }
            case 3: {
                return new aoet();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoet.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
