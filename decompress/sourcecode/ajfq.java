import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfq extends agzi implements ahax
{
    public static final ajfq a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public aqcz i;
    private byte k;
    
    static {
        final ajfq a2 = new ajfq();
        agzi.registerDefaultInstance(ajfq.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 355044355, ahcm.k, ajfq.class);
    }
    
    private ajfq() {
        this.k = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
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
                final ahbe j;
                if ((j = ajfq.j) == null) {
                    synchronized (ajfq.class) {
                        if (ajfq.j == null) {
                            ajfq.j = (ahbe)new agzb((agzi)ajfq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajfq.a;
            }
            case 4: {
                return new agza((agzi)ajfq.a);
            }
            case 3: {
                return new ajfq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfq.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
