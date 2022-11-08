import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvb extends agzi implements ahax
{
    public static final ajvb a;
    private static volatile ahbe l;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aorm f;
    public boolean g;
    public aioe h;
    public aioe i;
    public String j;
    public String k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(ajvb.class, a = new ajvb());
    }
    
    private ajvb() {
        this.m = 2;
        emptyProtobufList();
        this.j = "";
        this.k = "";
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
                final ahbe l;
                if ((l = ajvb.l) == null) {
                    synchronized (ajvb.class) {
                        if (ajvb.l == null) {
                            ajvb.l = (ahbe)new agzb((agzi)ajvb.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajvb.a;
            }
            case 4: {
                return new agza((agzi)ajvb.a);
            }
            case 3: {
                return new ajvb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvb.a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0007\u1007\u0006\n\u1409\u0007\u000b\u1409\b\f\u1008\t\r\u1008\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
