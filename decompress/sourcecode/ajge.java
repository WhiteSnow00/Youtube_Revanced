import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajge extends agzi implements ahax
{
    public static final ajge a;
    public static final agzg b;
    private static volatile ahbe o;
    public int c;
    public String d;
    public aorm e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public agzy m;
    public agyc n;
    private byte p;
    
    static {
        final ajge a2 = new ajge();
        agzi.registerDefaultInstance(ajge.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 199, ahcm.k, ajge.class);
    }
    
    private ajge() {
        this.p = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = agzi.emptyProtobufList();
        this.n = agyc.b;
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
                final ahbe o3;
                if ((o3 = ajge.o) == null) {
                    synchronized (ajge.class) {
                        if (ajge.o == null) {
                            ajge.o = (ahbe)new agzb((agzi)ajge.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajge.a;
            }
            case 4: {
                return new agza((short[])null, (byte[][][])null);
            }
            case 3: {
                return new ajge();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajge.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u001b\u000b\u100a\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", ajdq.class, "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
