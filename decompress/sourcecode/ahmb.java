import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmb extends agzi implements ahax
{
    public static final ahmb a;
    private static volatile ahbe f;
    public int b;
    public ahmc c;
    public aioe d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmb.class, (agzi)(a = new ahmb()));
    }
    
    private ahmb() {
        this.g = 2;
    }
    
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
                if ((f = ahmb.f) == null) {
                    synchronized (ahmb.class) {
                        if (ahmb.f == null) {
                            ahmb.f = (ahbe)new agzb((agzi)ahmb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahmb.a;
            }
            case 4: {
                return new agza((agzi)ahmb.a);
            }
            case 3: {
                return new ahmb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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