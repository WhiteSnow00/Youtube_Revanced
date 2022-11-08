import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaw extends agzi implements ahax
{
    public static final alaw a;
    private static volatile ahbe m;
    public int b;
    public akjd c;
    public apjb d;
    public altf e;
    public agzy f;
    public int g;
    public int h;
    public boolean i;
    public apeu j;
    public boolean k;
    public alav l;
    private byte n;
    
    static {
        agzi.registerDefaultInstance((Class)alaw.class, (agzi)(a = new alaw()));
    }
    
    private alaw() {
        this.n = 2;
        this.f = emptyProtobufList();
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
                final ahbe m;
                if ((m = alaw.m) == null) {
                    synchronized (alaw.class) {
                        if (alaw.m == null) {
                            alaw.m = (ahbe)new agzb((agzi)alaw.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alaw.a;
            }
            case 4: {
                return new agza((float[][][])null, (char[])null);
            }
            case 3: {
                return new alaw();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaw.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0003\u0004\u041b\u0005\u100c\u0004\u0006\u100c\u0005\t\u1007\u0006\n\u1009\u0007\u000b\u1007\b\f\u1009\t", new Object[] { "b", "c", "d", "e", "f", aliq.class, "g", angs.l, "h", akwf.n, "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
