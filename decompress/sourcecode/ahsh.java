import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsh extends agzi implements ahax
{
    public static final ahsh a;
    private static volatile ahbe i;
    public int b;
    public long c;
    public long d;
    public int e;
    public aorm f;
    public anfp g;
    public agzy h;
    private aioe j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(ahsh.class, a = new ahsh());
    }
    
    private ahsh() {
        this.l = 2;
        this.h = agzi.emptyProtobufList();
        emptyProtobufList();
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
                final ahbe i;
                if ((i = ahsh.i) == null) {
                    synchronized (ahsh.class) {
                        if (ahsh.i == null) {
                            ahsh.i = (ahbe)new agzb((agzi)ahsh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahsh.a;
            }
            case 4: {
                return new agza((agzi)ahsh.a);
            }
            case 3: {
                return new ahsh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsh.a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001\u1002\u0000\u0002\u1002\u0001\b\u1409\u0006\t\u1409\u0007\u000b\u1409\t\r\u1009\b\u000e\u001b\u0010\u1004\u0003", new Object[] { "b", "c", "d", "j", "f", "k", "g", "h", alud.class, "e" });
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
