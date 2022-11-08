import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appi extends agzi implements ahax
{
    public static final appi a;
    private static volatile ahbe h;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public aioe g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)appi.class, (agzi)(a = new appi()));
    }
    
    private appi() {
        this.j = 2;
        final agyc b = agyc.b;
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
                final ahbe h;
                if ((h = appi.h) == null) {
                    synchronized (appi.class) {
                        if (appi.h == null) {
                            appi.h = (ahbe)new agzb((agzi)appi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return appi.a;
            }
            case 4: {
                return new agza((agzi)appi.a);
            }
            case 3: {
                return new appi();
            }
            case 2: {
                return newMessageInfo((MessageLite)appi.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\u0004", new Object[] { "b", "c", "d", "e", "g", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
