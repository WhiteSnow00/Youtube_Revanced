import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfe extends agzi implements ahax
{
    public static final amfe a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public amfh f;
    public amff g;
    public aibc h;
    public agyc i;
    private aibc k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)amfe.class, (agzi)(a = new amfe()));
    }
    
    private amfe() {
        this.c = 0;
        this.m = 2;
        this.i = agyc.b;
        emptyProtobufList();
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
                final ahbe j;
                if ((j = amfe.j) == null) {
                    synchronized (amfe.class) {
                        if (amfe.j == null) {
                            amfe.j = (ahbe)new agzb((agzi)amfe.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amfe.a;
            }
            case 4: {
                return new agza((agzi)amfe.a);
            }
            case 3: {
                return new amfe();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfe.a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u103c\u0000\u0003\u1409\b\u0004\u100a\t\u0005\u1409\u0006\u0006\u1409\u0001\u0007\u143c\u0000\b\u1009\u0005\t\u1409\u0007\u000b\u143c\u0000", new Object[] { "d", "c", "b", "e", amfk.class, "l", "i", "h", "f", amfj.class, "g", "k", amfd.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
