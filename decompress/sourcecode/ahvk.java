import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvk extends agzi implements ahax
{
    public static final ahvk a;
    private static volatile ahbe d;
    public int b;
    public aioe c;
    private ahfw e;
    private aizm f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahvk.class, a = new ahvk());
    }
    
    private ahvk() {
        this.g = 2;
        final agyc b = agyc.b;
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
                if ((d = ahvk.d) == null) {
                    synchronized (ahvk.class) {
                        if (ahvk.d == null) {
                            ahvk.d = (ahbe)new agzb((agzi)ahvk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahvk.a;
            }
            case 4: {
                return new agza((agzi)ahvk.a);
            }
            case 3: {
                return new ahvk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvk.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0005\u1409\u0003", new Object[] { "b", "c", "e", "f" });
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
