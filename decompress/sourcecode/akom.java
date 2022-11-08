import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akom extends agzi implements ahax
{
    public static final akom a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public agyc d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akom.class, a = new akom());
    }
    
    private akom() {
        this.g = 2;
        this.d = agyc.b;
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
                if ((e = akom.e) == null) {
                    synchronized (akom.class) {
                        if (akom.e == null) {
                            akom.e = (ahbe)new agzb((agzi)akom.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akom.a;
            }
            case 4: {
                return new agza((agzi)akom.a);
            }
            case 3: {
                return new akom();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akom.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "f", "d" });
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
