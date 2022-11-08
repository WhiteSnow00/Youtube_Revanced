import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjj extends agzi implements ahax
{
    public static final ahjj a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public aioe d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahjj.class, (agzi)(a = new ahjj()));
    }
    
    private ahjj() {
        this.f = 2;
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
                final ahbe e;
                if ((e = ahjj.e) == null) {
                    synchronized (ahjj.class) {
                        if (ahjj.e == null) {
                            ahjj.e = (ahbe)new agzb((agzi)ahjj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjj.a;
            }
            case 4: {
                return new agza((agzi)ahjj.a);
            }
            case 3: {
                return new ahjj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
