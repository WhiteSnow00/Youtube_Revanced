import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiul extends agzi implements ahax
{
    public static final aiul a;
    private static volatile ahbe g;
    public int b;
    public ajsq c;
    public aorm d;
    public aioe e;
    public agyc f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aiul.class, a = new aiul());
    }
    
    private aiul() {
        this.i = 2;
        this.f = agyc.b;
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
                if ((g = aiul.g) == null) {
                    synchronized (aiul.class) {
                        if (aiul.g == null) {
                            aiul.g = (ahbe)new agzb((agzi)aiul.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiul.a;
            }
            case 4: {
                return new agza((agzi)aiul.a);
            }
            case 3: {
                return new aiul();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiul.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}