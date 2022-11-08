import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivf extends agzi implements ahax
{
    public static final aivf a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajau d;
    public long e;
    public aioe f;
    public String g;
    private aibc i;
    private aibc j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(aivf.class, a = new aivf());
    }
    
    private aivf() {
        this.l = 2;
        final agyc b = agyc.b;
        this.g = "";
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
                final ahbe h;
                if ((h = aivf.h) == null) {
                    synchronized (aivf.class) {
                        if (aivf.h == null) {
                            aivf.h = (ahbe)new agzb((agzi)aivf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aivf.a;
            }
            case 4: {
                return new agza((agzi)aivf.a);
            }
            case 3: {
                return new aivf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivf.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0007\u1409\u0007\b\u1008\b\t\u1002\u0004", new Object[] { "b", "c", "d", "i", "j", "k", "f", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
